

public class TestStaticMethod{
	public static void main(String[] args){
		StaticMethod obj=new StaticMethod();
		StaticMethod.sMethod1();		//在类外通过类名调用静态方法
		StaticMethod.sMethod2(obj);
		obj.iMethod();
	}
}

class StaticMethod{
	int x=0;
	static int y=1;
	public void iMethod(){
		System.out.print("x;y = "+x+";");
		sMethod1();
		y++;
	}
	public static void sMethod1(){
		//System.out.println(this.x);		//不能访问实例成员变量
		//iMethod();						//不能访问实例方法
		System.out.println(StaticMethod.y);	//可以访问静态变量
	}
	public static void sMethod2(StaticMethod o){
		System.out.println(o.x);			//可以通过o引用访问实例成员变量
		o.iMethod();						//可以通过o引用调用实例方法
		System.out.print("Calling sMethod1() in sMethod2(): ");
		sMethod1();							//可以直接调用静态方法
	}
}