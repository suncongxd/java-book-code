package regex;

public class StringMatch{
	public static void main(String[] args){
		System.out.println("12345".matches("-?\\d+"));
		System.out.println("-67890".matches("-?\\d+"));
		System.out.println("+1982".matches("-?\\d+"));
		System.out.println("+1982".matches("(-|\\+)?\\d+"));
	}
}