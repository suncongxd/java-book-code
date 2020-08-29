package regex;

import java.util.Arrays;

public class StringSplit{
	private static String content = "I believe I can fly, I believe I can touch the sky.";
	private static void split(String regex){
		System.out.println(Arrays.toString(content.split(regex)));
	}
	public static void main(String[] args){
		split(" ");
		split("\\W+");
		split("e\\W+");
	}
}