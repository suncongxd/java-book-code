

import java.util.EnumSet;

public class TestEnumSet{
	public static void main(String[] args){
		EnumSet<Month> es=EnumSet.noneOf(Month.class);		//创建一个空的EnumSet
		es.add(Month.January);				//添加一个元素
		System.out.println(es);
		es.addAll(EnumSet.of(Month.April, Month.May, Month.August));	//添加一个EnumSet中的所有元素
		System.out.println(es);
		es=EnumSet.allOf(Month.class);		//用Month的所有常量创建EnumSet
		System.out.println(es);
		es=EnumSet.range(Month.June, Month.November);		//用Month的范围内的所有常量创建EnumSet
		System.out.println(es);
		es=EnumSet.complementOf(es);		//用参数EnumSet中元素的补集创建EnumSet
		System.out.println(es);
	}
}

enum Month{
	January, February, March, April, May, June, July, August, September, October, November, December
}