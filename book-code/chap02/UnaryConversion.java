

public class UnaryConversion{
	public static void main(String[] args){
		byte b=2;
		char c='\u1234';
		//byte b2=-b; //����byteת��Ϊint, int����ֵ����ֱ�Ӹ���byte���ͱ���b2
		//char c2=+c; //����charת��Ϊint, int����ֵ����ֱ�Ӹ���char���ͱ���c2
		System.out.println((-b) + ";" + (+c));
		int i=~b;//byteת��Ϊint
		System.out.println(Integer.toHexString(i));
	}
}