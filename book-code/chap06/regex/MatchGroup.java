package regex;

import java.util.regex.*;

public class MatchGroup{
	public static void main(String[] args){
		String url="http://cs.xidian.edu.cn:8080";
		String regex="(?x) ^(https?):// ([^/:]+) (?::(\\d+))?";
		Matcher m=Pattern.compile(regex).matcher(url);
		if(m.find()){
			System.out.println("Overall ["+m.group()+"] at ("+m.start()+","+m.end()+")");
			System.out.println("Protocol ["+m.group(1)+"] at ("+m.start(1)+","+m.end(1)+")");
			System.out.println("Hostname ["+m.group(2)+"] at ("+m.start(2)+","+m.end(2)+")");
		}
		if(m.group(3)==null)
			System.out.println("default port: 80");
		else
			System.out.println("Port ["+m.group(3)+"] at ("+m.start(3)+","+m.end(3)+")");
	}
}