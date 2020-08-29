package pkg2; //chap03.pkg2与chap03.pkg1不是同一个包

import pkg1.*;

public class PublicVsPackage{
	public static void main(String[] args){
		A obj=new A();
		//B obj2=new B();	//类型B为package权限，在chap03.pkg1之外不能创建B的对象
		//obj.func();		//func()为package权限，在chap03.pkg1之外的类无法访问该方法
	}
}