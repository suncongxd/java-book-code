

import java.util.Random;

public class TestShapesAbsClass{
	public void showWhat(Shape s) {
		System.out.println(s.what());
	}
	public static void main(String[] args){
		//Shape s=new Shape();		//不能实例化Shape
		TestShapesAbsClass ts=new TestShapesAbsClass();
		Shape[] ss=new Shape[5];
		Random rand=new Random(37);
		for(int i=0;i<ss.length;i++){	//初始化ss的每个元素
			switch(rand.nextInt(3)){
			case 0: ss[i]=new Circle(); break;
			case 1: ss[i]=new Rectangle(); break;
			case 2: ss[i]=new Triangle(); break;
			default: 
			}
		}
		for(int i=0;i<ss.length;i++){	//依次输出what方法的返回值
			ts.showWhat(ss[i]);
		}
	}
}
abstract class Shape {
	abstract void draw();
	abstract void erase();
	String what() { return "Shape"; }
}
class Circle extends Shape {
	void draw() { System.out.println("Draw Circle"); }
	void erase() { System.out.println("Erase Circle"); }
	String what() { return "Circle"; }
}
class Rectangle extends Shape {
	void draw() { System.out.println("Draw Rectangle"); }
	void erase() { System.out.println("Erase Rectangle"); }
	String what() { return "Rectangle"; }
}
class Triangle extends Shape {
	void draw() { System.out.println("Draw Triangle"); }
	void erase() { System.out.println("Erase Triangle"); }
}
