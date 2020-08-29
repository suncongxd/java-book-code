

import java.util.*;

public class TestListIterator{
	public static void main(String[] args){
		String sentence="I believe I can fly, I believe I can touch the sky.";
		String[] strs=sentence.split(" ");
		List<String> list=new ArrayList<String>( Arrays.asList(strs) );
		
		ListIterator<String> li=list.listIterator();
		while(li.hasNext()){
			System.out.print(li.next()+"_");
		}
		System.out.println();
		while(li.hasPrevious()){
			System.out.print(li.previous()+"_");
		}
		System.out.println();
		
		while(li.hasNext()){
			if(li.next().equals("I")){
				li.set("You");
			}
		}
		li=list.listIterator();
		while(li.hasNext()){
			System.out.print(li.next()+" ");
		}
		System.out.println();
		
		li=list.listIterator();
		while(li.hasNext()){
			if(li.next().equals("You")){
				li.add("and I");
			}
		}
		li=list.listIterator();
		while(li.hasNext()){
			System.out.print(li.next()+" ");
		}
		System.out.println();
	}
}