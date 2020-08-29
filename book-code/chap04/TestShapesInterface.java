

import java.util.Random;

public class TestShapesInterface{
	public void showWhat(Shape1 s) {
		System.out.println(s.what());
	}
	public static void main(String[] args){
		TestShapesInterface ti=new TestShapesInterface();
		Shape1[] ss=new Shape1[5];
		Random rand=new Random(37);
		for(int i=0;i<ss.length;i++){	//初始化ss的每个元素
			switch(rand.nextInt(3)){
			case 0: ss[i]=new Circle1(); break;
			case 1: ss[i]=new Rectangle1(); break;
			case 2: ss[i]=new Triangle1(); break;
			default: 
			}
		}
		for(int i=0;i<ss.length;i++){	//依次输出what方法的返回值
			ti.showWhat(ss[i]);
		}
	}
}

interface Shape1 {
	void draw();
	void erase();
	String what();
}

class Circle1 implements Shape1 {
	public void draw() { System.out.println("Draw Circle"); }
	public void erase() { System.out.println("Erase Circle"); }
	public String what() { return "Circle"; }
}
class Rectangle1 implements Shape1 {
	public void draw() { System.out.println("Draw Rectangle"); }
	public void erase() { System.out.println("Erase Rectangle"); }
	public String what() { return "Rectangle"; }
}
class Triangle1 implements Shape1 {
	public void draw() { System.out.println("Draw Triangle"); }
	public void erase() { System.out.println("Erase Triangle"); }
	public String what() { return "Triangle"; }
}
abstract class Oval implements Shape1{		//如果没有实现所有接口方法，则为抽象类
	public void draw() { System.out.println("Draw Oval"); }
}