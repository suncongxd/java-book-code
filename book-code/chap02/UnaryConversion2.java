

public class UnaryConversion2{
	public static void main(String[] args){
		byte b=2;
		int a[] = new int[b];	//byte�Զ���չת��Ϊint
		char c = '\u0001';
		a[c] = 1;				//char�Զ���չת��Ϊint
	}
}