

public class Downcasting{
	public static void main(String[] args){
		BaseClass[] b={new BaseClass(), new SubClass()};
		b[0].f();
		b[1].f();
		//! b[1].g();	//b[i]ΪBaseClass���ͣ�ֻ��f()�ӿڷ���
		((SubClass)b[1]).g();
		//! ((SubClass)b[0]).g();	//�׳�����ʱ�쳣
		for(int i=0;i<b.length;i++){
			if(b[i] instanceof SubClass)
				((SubClass)b[i]).g();
		}
	}
}
class BaseClass{
	public void f() { System.out.println("Base.f()"); }
}
class SubClass extends BaseClass{
	public void f() { System.out.println("Sub.f()"); }
	public void g() { System.out.println("Sub.g()"); }
}