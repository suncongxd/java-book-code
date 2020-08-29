package regex;

public class StringReplacement{
	private static String content = "I believe I can fly, I believe I can touch the sky.";
	public static void main(String[] args){
		System.out.println(content.replaceAll("I\\W+", "You-"));
		System.out.println(content.replaceFirst("c\\w+", "cannot"));
	}
}