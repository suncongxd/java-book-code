

public class Triangle extends Shape{
	public void draw(){
		System.out.println("Draw triangle");
	}
	public static void main(String[] args){
		Triangle su=new Triangle();
		Shape s=new Shape();
		s.func(su);		//ͨ����������ʵ��upcasting
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
		s=new Triangle();//ͨ������ʵ����ʵ��upcasting
	}
	public void func(){
		s.draw();
		Triangle t=new Triangle();
		s=t;	//ͨ��������ֵʵ��upcasting
		s.draw();
	}
}
