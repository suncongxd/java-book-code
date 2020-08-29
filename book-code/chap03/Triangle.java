

public class Triangle extends Shape{
	public void draw(){
		System.out.println("Draw triangle");
	}
	public static void main(String[] args){
		Triangle su=new Triangle();
		Shape s=new Shape();
		s.func(su);		//通过参数传递实现upcasting
		Other o=new Other();
		o.func();
	}
}
class Shape{
	public void draw(){
		System.out.println("Draw shape");
	}
	public void func(Shape s){
		s.draw();
	}
}
class Other{
	Shape s;
	public Other(){
		s=new Triangle();//通过对象实例化实现upcasting
	}
	public void func(){
		s.draw();
		Triangle t=new Triangle();
		s=t;	//通过变量赋值实现upcasting
		s.draw();
	}
}
