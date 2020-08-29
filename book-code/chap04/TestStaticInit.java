

public class TestStaticInit{
	public static void main(String[] args){
		System.out.println(StaticInit.j);
	}
}

class StaticInit{
	static int i;
	static int j=2;
	static {
		System.out.println(i+";"+j);
	}
	int k=4;
	static {
		i=3; 
	}
	static {
		System.out.println(i+";"+j);
	}
}