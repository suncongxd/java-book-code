

import java.util.*;

public class TestCollection{
	Collection<String> fill(Collection<String> col){
		col.add("Java");
		col.add("C");
		col.add("Python");
		col.add("Python");
		return col;
	}
	Map<String,Integer> fill(Map<String,Integer> map){
		map.put("Java", 19);
		map.put("C", 42);
		map.put("Python", 100);
		map.put("Python", 101);
		return map;
	}
	public static void main(String[] args){
		TestCollection tc=new TestCollection();
		System.out.println(tc.fill(new ArrayList<String>()));
		System.out.println(tc.fill(new LinkedList<String>()));
		System.out.println(tc.fill(new HashSet<String>()));
		System.out.println(tc.fill(new TreeSet<String>()));
		System.out.println(tc.fill(new LinkedHashSet<String>()));
		System.out.println(tc.fill(new HashMap<String,Integer>()));
		System.out.println(tc.fill(new TreeMap<String,Integer>()));
		System.out.println(tc.fill(new LinkedHashMap<String,Integer>()));
	}
}