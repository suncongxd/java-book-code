package shape;

import java.util.*;

public class TestShapes{
	public void draw(Shape s){
		s.draw();
	}
	public static void main(String[] args){
		TestShapes ts=new TestShapes();
		Shape[] ss=new Shape[5];
		Random rand=new Random(37);
		for(int i=0;i<ss.length;i++){	//初始化ss的每个元素
			switch(rand.nextInt(3)){
			case 0:	ss[i]=new Circle(); break;
			case 1: ss[i]=new Rectangle(); break;
			case 2: ss[i]=new Triangle(); break;
			default: 
			}
		}
		for(int i=0;i<ss.length;i++){
			ts.draw(ss[i]);
		}			
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