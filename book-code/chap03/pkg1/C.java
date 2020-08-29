package pkg1;

public class C{
	protected void func(){
		System.out.println("Protected method of C");
	}
	public static void main(String[] args){
		D.mtd();
	}
}
class D{
	static void mtd(){
		C obj=new C();
		obj.func(); //protected权限包含包访问权限
	}
}