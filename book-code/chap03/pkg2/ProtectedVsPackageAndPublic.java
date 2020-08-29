package pkg2;

import pkg1.C;

public class ProtectedVsPackageAndPublic{
	public static void main(String[] args){
		C obj=new C();
		//! obj.func();	//ProtectedVsPackage类不是C的子类，无法访问C的func()方法，表明protected与public不同
	}
}

class CSub extends C{	//CSub是C的子类，可以访问C的func()方法，表明protected与包访问权限不同
	void mtd(C parent, CSub sub){	
		func();
		//！ parent.func();	//子类可以访问func()方法，但应通过子类的引用，而不是父类的引用
		sub.func();
	}
}