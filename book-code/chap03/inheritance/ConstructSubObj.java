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
		super(id); //����ʹ�ã���Ϊstudentû��Ĭ�Ϲ��췽��
		System.out.println("Undergraduate"); 
	}
}
