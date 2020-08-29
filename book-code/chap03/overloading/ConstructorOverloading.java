package overloading;

public class ConstructorOverloading{
	public static void main(String[] args){
		Student stu=new Student();
		System.out.println(stu.getName()+", "+stu.getID());
	}
}

class Student{
	private String name;
	private String id;
	
	public Student(String nm, String id){
		this.name=nm;
		this.id=id;
	}
	public Student(String nm){
		this(nm,"00000000");
	}
	public Student(){
		this("Unknown");
	}
	public String getName(){
		return name;
	}
	public String getID(){
		return id;
	}
}