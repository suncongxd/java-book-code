package pkg2;

public class PrivateVsPackage{
	public static void main(String[] args){
		C obj=new C();	//默认构造方法的访问权限与类的访问权限相同，因此类C的默认构造方法为包访问权限
		obj.func2();
		//obj.func1();	//与C在同一包中的其他类无法访问func1()
	}
}

class C{
	private void func1(){
		System.out.println("C's method 1");
	}
	void func2(){
		System.out.println("C's method 2");
		this.func1();	//同一个类内可以调用func1()
	}
}