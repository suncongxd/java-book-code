package regex;

import java.util.regex.*;

public class PatternMatcherTest{
	public static void main(String[] args){
		Matcher m=Pattern.compile("\\w+").matcher("I believe I can fly, I believe I can touch the sky.");
		while(m.find()){
			System.out.print(m.group()+" ");
		}
		System.out.println();
		
		int i=0;
		while(m.find(i)){
			System.out.print(m.group()+" ");
			i++;
		}
		System.out.println();
		
		m=Pattern.compile("\\d+\\w+").matcher("This is my 1st paper");
		while(m.find()){
			System.out.println("Match ["+m.group()+"] at ("+m.start()+","+m.end()+")");
		}
	}
}