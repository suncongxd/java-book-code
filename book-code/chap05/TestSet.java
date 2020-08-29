

import java.util.*;

public class TestSet{
	public static void main(String[] args){
		Random rand=new Random(47);
		Set<Integer> s=new HashSet<Integer>();
		for(int i=0;i<5000;i++){
			s.add(rand.nextInt(40));
		}
		System.out.println(s);
		
		s=new TreeSet<Integer>();
		for(int i=0;i<5000;i++){
			s.add(rand.nextInt(40));
		}
		System.out.println(s);
		
		s=new LinkedHashSet<Integer>();
		for(int i=0;i<5000;i++){
			s.add(rand.nextInt(40));
		}
		System.out.println(s);
	}
}