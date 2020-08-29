

import java.util.EnumSet;

public class TestEnumSet{
	public static void main(String[] args){
		EnumSet<Month> es=EnumSet.noneOf(Month.class);		//����һ���յ�EnumSet
		es.add(Month.January);				//���һ��Ԫ��
		System.out.println(es);
		es.addAll(EnumSet.of(Month.April, Month.May, Month.August));	//���һ��EnumSet�е�����Ԫ��
		System.out.println(es);
		es=EnumSet.allOf(Month.class);		//��Month�����г�������EnumSet
		System.out.println(es);
		es=EnumSet.range(Month.June, Month.November);		//��Month�ķ�Χ�ڵ����г�������EnumSet
		System.out.println(es);
		es=EnumSet.complementOf(es);		//�ò���EnumSet��Ԫ�صĲ�������EnumSet
		System.out.println(es);
	}
}

enum Month{
	January, February, March, April, May, June, July, August, September, October, November, December
}