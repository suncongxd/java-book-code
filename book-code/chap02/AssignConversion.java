

public class AssignConversion{
	public static void main(String[] args){
		int i=123456789;
		long l=9123456789000000000L;
		float f;
		double d;
		
		f=i; //��ʧ����
		System.out.println(f);
		f=l; //��ʧ����
		System.out.println(f);
		d=l; //��ʧ����
		System.out.println(d);
		f=1.23f;
		d=f; //������Чλ
		System.out.println(d);
	}
}