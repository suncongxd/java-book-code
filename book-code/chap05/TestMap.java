

import java.util.*;

public class TestMap{
	static String[] s=new String[4];
	static {
		s[0]="I have a dream that one day this nation will rise up, "
				+ "live up to the true meaning of its creed: "
				+ "\"We hold these truths to be self-evident; "
				+ "that all men are created equal.\"";
		s[1]="I have a dream that one day on the red hills of Georgia "
				+ "the sons of former slaves and the sons of former slave-owners "
				+ "will be able to sit down together at the table of brotherhood.";
		s[2]="I have a dream that one day even the state of Mississippi, "
				+ "a state sweltering with the heat of injustice, "
				+ "sweltering with the heat of oppression, "
				+ "will be transformed into an oasis of freedom and justice";
		s[3]="I have a dream that my four children will one day live in a nation "
				+ "where they will not be judged by the color if their skin "
				+ "but by the content of their character.";
	}
	public static void main(String[] args){
		Map<String,Integer> statistics=new HashMap<String,Integer>();
		
		for(int i=0;i<s.length;i++){
			StringTokenizer st=new StringTokenizer(s[i],",.;:-\" ");
			while(st.hasMoreTokens()){
				String key=st.nextToken();
				if(statistics.get(key)!=null){
					statistics.put(key, statistics.get(key)+1);
				}
				else
					statistics.put(key, 1);
			}
		}
		System.out.println(statistics);
	}
}