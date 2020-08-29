

public class UnaryConversion{
	public static void main(String[] args){
		byte b=2;
		char c='\u1234';
		//byte b2=-b; //错误，byte转换为int, int类型值不能直接赋给byte类型变量b2
		//char c2=+c; //错误，char转换为int, int类型值不能直接赋给char类型变量c2
		System.out.println((-b) + ";" + (+c));
		int i=~b;//byte转换为int
		System.out.println(Integer.toHexString(i));
	}
}