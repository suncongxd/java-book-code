

public class UnaryConversion2{
	public static void main(String[] args){
		byte b=2;
		int a[] = new int[b];	//byte自动扩展转换为int
		char c = '\u0001';
		a[c] = 1;				//char自动扩展转换为int
	}
}