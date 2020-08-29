package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replacement{
	public static void main(String[] args){
		String text="Before Java 1.5 was Java 1.4.2. After Java 1.5 is Java 1.6";
		String regex="\\bJava\\s*1\\.([56])\\b";
		Matcher m=Pattern.compile(regex).matcher(text);
		String result=m.replaceAll("Java $1.0");
		System.out.println(result);
		
		m=Pattern.compile("\\w+").matcher("++one--two++");
		StringBuffer sb=new StringBuffer();
		while(m.find()){
			m.appendReplacement(sb, "YYY");
		}
		System.out.println(sb.toString());
		m.appendTail(sb);
		System.out.println(sb.toString());
	}
}