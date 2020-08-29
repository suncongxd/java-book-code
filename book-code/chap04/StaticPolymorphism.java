

public class StaticPolymorphism{
	public static void main(String[] args){
		Sup s=new Sub();
		s.mtd1();
		s.mtd2();
	}
}

class Sup {
	public void mtd1() {
		System.out.println("Sup.instanceMethod");
	}
	public static void mtd2() {
		System.out.println("Sup.staticMethod");
	}
}

class Sub extends Sup{
	//public static void mtd1() {}	//��̬������������ʵ������
	//public void mtd2() {}			//ʵ������������д��̬����
	public void mtd1(){
		System.out.println("Sub.instanceMethod");
	}
	public static void mtd2() {
		System.out.println("Sub.staticMethod");
	}
}