package pkg2;

public class PrivateVsPackage{
	public static void main(String[] args){
		C obj=new C();	//Ĭ�Ϲ��췽���ķ���Ȩ������ķ���Ȩ����ͬ�������C��Ĭ�Ϲ��췽��Ϊ������Ȩ��
		obj.func2();
		//obj.func1();	//��C��ͬһ���е��������޷�����func1()
	}
}

class C{
	private void func1(){
		System.out.println("C's method 1");
	}
	void func2(){
		System.out.println("C's method 2");
		this.func1();	//ͬһ�����ڿ��Ե���func1()
	}
}