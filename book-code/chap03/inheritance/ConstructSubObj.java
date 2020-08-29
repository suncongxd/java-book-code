package inheritance;

public class ConstructSubObj{
	public static void main(String[] args){
		Undergraduate ug=new Undergraduate(12345678);
	}
}
class Person{
	Person() { System.out.println("Person"); }
}
class Student extends Person{
	Student(int id) { System.out.println("Student "+id); }
}
class Undergraduate extends Student{
	Undergraduate(int id) {
		super(id); //必须使用，因为student没有默认构造方法
		System.out.println("Undergraduate"); 
	}
}
