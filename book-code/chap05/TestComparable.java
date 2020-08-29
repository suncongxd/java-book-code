

import java.util.*;

public class TestComparable{
	static String s="I have a dream that one day on the red hills of Georgia "
				+ "the sons of former slaves and the sons of former slave-owners "
				+ "will be able to sit down together at the table of brotherhood.";
	
	public static void main(String[] args){
		Set<NewString> ts=new TreeSet<NewString>();
		StringTokenizer st=new StringTokenizer(s,",.;:-\" ");
		while(st.hasMoreTokens()){
			ts.add(new NewString(st.nextToken()));
		}
		System.out.println(ts);
		
		Queue<NewString> q=new PriorityQueue<NewString>();
		st=new StringTokenizer(s,",.;:-\" ");
		while(st.hasMoreTokens()){
			q.add(new NewString(st.nextToken()));
		}
		while(q.peek()!=null)
			System.out.print(q.remove()+" ");
		System.out.println();
	}
}

class NewString implements Comparable<NewString>{
	private String s;
	
	public NewString(String s){
		this.s=s;
	}
	public int length(){
		return s.length();
	}
	public String toString(){
		return s;
	}
	public int compareTo(NewString ns){
		if(this.length()> ns.length())
			return 1;
		else if(this.length()==ns.length())
			//return 0;
			return this.s.compareTo(ns.s);
		else
			return -1;
	}
}