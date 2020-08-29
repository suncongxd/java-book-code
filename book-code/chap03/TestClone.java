

public class TestClone implements Cloneable{
	Name name=new Name("Sun Cong");
	
	public static void main(String[] args){
		TestClone o1=new TestClone();
		System.out.println(o1.toString());
		System.out.println(o1.getClass().toString());
		try{
			TestClone o2=(TestClone)o1.clone();
			System.out.println(o2.name.getName());
			o2.name.setName("Li Lei");
			System.out.println(o1.name.getName());
		} catch(CloneNotSupportedException e){}
	}
}

class Name{
	private String nm;
	public Name(String s){
		nm=s;
	}
	public String getName(){
		return nm;
	}
	public void setName(String s){
		nm=s;
	}
}