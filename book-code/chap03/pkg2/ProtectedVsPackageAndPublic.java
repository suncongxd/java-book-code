package pkg2;

import pkg1.C;

public class ProtectedVsPackageAndPublic{
	public static void main(String[] args){
		C obj=new C();
		//! obj.func();	//ProtectedVsPackage�಻��C�����࣬�޷�����C��func()����������protected��public��ͬ
	}
}

class CSub extends C{	//CSub��C�����࣬���Է���C��func()����������protected�������Ȩ�޲�ͬ
	void mtd(C parent, CSub sub){	
		func();
		//�� parent.func();	//������Է���func()��������Ӧͨ����������ã������Ǹ��������
		sub.func();
	}
}