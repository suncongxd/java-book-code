

public class PolyConstructor{
	public static void main(String[] args){
		Sub1 s=new Sub1(100);
	}
}
class Base1{
	public void f() { System.out.println("Base.f()"); }
	public Base1(){
		System.out.println("enter Base()");
		this.f();
		System.out.println("exit Base()");
	}
}
class Sub1 extends Base1{
	int i=5;
	public void f() { System.out.println("Sub.f(), i="+i); }
	public Sub1(int n){
		System.out.println("enter Sub(), i="+i);
		f();
		i=n;
		System.out.println("exit Sub(), i="+i);
	}
}