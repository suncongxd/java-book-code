

import java.util.*;

public class TestShapesArrayList{
	public void draw(Shape s){
		s.draw();
	}
	public void draw(List<Shape> ss){
		for(int i=0;i<ss.size();i++){
			draw(ss.get(i));
		}
	}
	public static void main(String[] args){
		List<Shape> ss=new ArrayList<Shape>();
		Random rand=new Random(37);
		for(int i=0;i<5;i++){
			switch(rand.nextInt(3)){
			case 0:	ss.add(i,new Circle()); break;
			case 1: ss.add(new Rectangle()); break;
			case 2: ss.add(0,new Triangle()); break;
			default: 
			}
		}
		TestShapesArrayList ts=new TestShapesArrayList();
		ts.draw(ss);
		
		System.out.println("=>Set");
		ss.set(ss.size()-2, new Triangle());
		ts.draw(ss);
		
		Shape s=ss.get(ss.size()-2);
		System.out.print("=>");
		s.erase();
		ss.remove(ss.indexOf(s));
		ts.draw(ss);
	}
}

class Shape {
	void draw() {}
	void erase() {}
}

class Circle extends Shape {
	void draw() { System.out.println("Draw Circle"); }
	void erase() { System.out.println("Erase Circle"); }
}

class Rectangle extends Shape {
	void draw() { System.out.println("Draw Rectangle"); }
	void erase() { System.out.println("Erase Rectangle"); }
}

class Triangle extends Shape {
	void draw() { System.out.println("Draw Triangle"); }
	void erase() { System.out.println("Erase Triangle"); }
}