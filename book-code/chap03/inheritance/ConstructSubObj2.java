package inheritance;

public class ConstructSubObj2{
	public static void main(String[] args){
		Undergraduate2 ug=new Undergraduate2();
	}
}
class Dorm{
	Dorm() { System.out.println("Dorm"); }
}
class Major{
	Major() { System.out.println("Major"); }
}
class Person2{
	Person2() { System.out.println("Person"); }
}
class Student2 extends Person2{
	Student2() { System.out.println("Student"); }
}
class Undergraduate2 extends Student2{
	private Major major;
	private Dorm dorm=new Dorm();
	{
		major=new Major();
	}
	Undergraduate2() {
		System.out.println("Undergraduate"); 
	}
}