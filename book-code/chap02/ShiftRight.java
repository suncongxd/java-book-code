

public class ShiftRight{
	public static void main(String[] args){
		System.out.println(Integer.toBinaryString(-12));
		
		int i=-12;
		System.out.println(Integer.toBinaryString(i>>2)); //带符号右移
		System.out.println(Integer.toBinaryString(i>>>2));//无符号右移
		
		byte b=-12;
		System.out.println(Integer.toBinaryString(b>>2));//首先byte转换为int，然后带符号右移
		System.out.println(Integer.toBinaryString(b>>>2));//首先byte转换为int，然后无符号右移
		
		System.out.println(Integer.toBinaryString(b>>2L));//byte转换为int，而不会转换为long
		System.out.println(Long.toBinaryString(-12L>>2L));
	}
}