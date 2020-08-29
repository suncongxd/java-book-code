package inheritance;

public class TestInheritance{
	public static void main(String[] args){
		Rectangle rect=new Rectangle();
		rect.newDraw();
		Circle circ=new Circle();
		circ.newDraw();
	}
}
class Shape{
	public void draw(){
		System.out.println("Draw shape");
	}
}
class Rectangle extends Shape{
	public void draw(){
		System.out.println("Draw Rectangle");
	}
	public void newDraw(){
		draw();
		super.draw();
	}
}
class Circle extends Shape{
	public void newDraw(){
		draw();
		super.draw();
	}
}