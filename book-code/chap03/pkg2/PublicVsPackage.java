package pkg2; //chap03.pkg2��chap03.pkg1����ͬһ����

import pkg1.*;

public class PublicVsPackage{
	public static void main(String[] args){
		A obj=new A();
		//B obj2=new B();	//����BΪpackageȨ�ޣ���chap03.pkg1֮�ⲻ�ܴ���B�Ķ���
		//obj.func();		//func()ΪpackageȨ�ޣ���chap03.pkg1֮������޷����ʸ÷���
	}
}