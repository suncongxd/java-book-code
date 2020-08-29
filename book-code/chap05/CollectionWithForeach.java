

import java.util.*;

public class CollectionWithForeach{
	public static void main(String[] args){
		String sentence="I believe I can fly, I believe I can touch the sky.";
		String[] strs=sentence.split(" ");
		Collection<String> c=new ArrayList<String>( Arrays.asList(strs) );
		
		for(String s: c){
			System.out.print(s+"_");
		}
	}
}