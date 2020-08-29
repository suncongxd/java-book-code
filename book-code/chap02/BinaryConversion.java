

public class BinaryConversion{
	public static void main(String[] args){
		int i=0;
		float f=2.0f;
		double d=4.0;
		
		//首先float*int转换为float*float，然后float==double转换为double==double
		System.out.println(f*i==d);
		
		byte b=0x1f;
		char c='G';
		//byte&char转换为int&int
		System.out.println(Integer.toHexString(b&c));
		
		f = (b==0) ? i : 6.0f; //int:float转换为float:float
		System.out.println(f/2.0); //float/double转换为double/double		
	}
}