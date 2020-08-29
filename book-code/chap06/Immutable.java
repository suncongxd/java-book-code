


public class Immutable{
	public static String lowerCase(String s){
		return s.toLowerCase();
	}
	public static void main(String[] args){
		String s="Java";
		System.out.println(s);
		String s2=lowerCase(s);
		System.out.println(s2);
		System.out.println(s);
	}
}