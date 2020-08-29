package regex;

import java.util.Arrays;
import java.util.regex.Pattern;

public class PatternSplit{
	private static String content = "I believe I can fly, I believe I can touch the sky.";
	private static void split(String regex){
		System.out.println(Arrays.toString(Pattern.compile(regex).split(content)));
	}
	public static void main(String[] args){
		split(" ");
		split("\\W+");
		split("e\\W+");
	}
}