package overloading;

public class TestOverloading{
	public static void main(String[] args){
		System.out.println(false);	//println(boolean b): ����߼�ֵ
		System.out.println('C');	//println(char c): ����ַ�
		System.out.println(123);	//println(int i): ���int����ֵ
		System.out.println(123L);	//println(long l): ���long����ֵ
		System.out.println(12.3f);	//println(float f): ���float����ֵ
		System.out.println(12.3);	//println(double d): ���double����ֵ
		System.out.println();		//println(): ������з�
		char[] cc={'a','b','c'};
		System.out.println(cc);		//println(char[] lc): ���һ���ַ������ֵ
		System.out.println("abc");	//println(String s): ���һ���ַ���
		System.out.println(new java.util.Date());	//println(Object o): ���һ�������ֵ
	}
}