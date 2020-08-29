package overloading;

public class TestOverloading{
	public static void main(String[] args){
		System.out.println(false);	//println(boolean b): 输出逻辑值
		System.out.println('C');	//println(char c): 输出字符
		System.out.println(123);	//println(int i): 输出int类型值
		System.out.println(123L);	//println(long l): 输出long类型值
		System.out.println(12.3f);	//println(float f): 输出float类型值
		System.out.println(12.3);	//println(double d): 输出double类型值
		System.out.println();		//println(): 输出换行符
		char[] cc={'a','b','c'};
		System.out.println(cc);		//println(char[] lc): 输出一个字符数组的值
		System.out.println("abc");	//println(String s): 输出一个字符串
		System.out.println(new java.util.Date());	//println(Object o): 输出一个对象的值
	}
}