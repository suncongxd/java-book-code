package chap04;

class Insect{
	private int i=9;
	protected int j;
	Insect(){
		System.out.println("i="+i+",j="+j);
		j=39;
	}
	static int printInit(String s){
		System.out.println(s);
		return 47;
	}
	private static int x1=printInit("static Insect.x1 initialized");
}
public class Beetle extends Insect{
	private int k=printInit("Beetle.k initialized");
	public Beetle(){
		System.out.println("k="+k+",j="+j);
	}
	private static int x2=printInit("static Beetle.x2 initialized");
	public static void main(String[] args){
		System.out.println("Beetle constructor");
		Beetle b=new Beetle();
	}
}