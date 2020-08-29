

import java.util.*;

public class TestEnumMap{
	public static void main(String[] args){
		EnumMap<Month,Integer> em=new EnumMap<Month,Integer>(Month.class);
		em.put(Month.January, -3);
		em.put(Month.February, -1);
		em.put(Month.March, 8);
		em.put(Month.April, 16);
		em.put(Month.May, 20);
		em.put(Month.June, 25);
		em.put(Month.July, 31);
		em.put(Month.August, 29);
		em.put(Month.September, 24);
		em.put(Month.October, 18);
		em.put(Month.November, 9);
		em.put(Month.December, 0);
		System.out.println(em);
	}
	enum Month{
		January, February, March, April, May, June, July, August, September, October, November, December
	}
}
