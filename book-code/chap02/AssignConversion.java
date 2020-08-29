

public class AssignConversion{
	public static void main(String[] args){
		int i=123456789;
		long l=9123456789000000000L;
		float f;
		double d;
		
		f=i; //损失精度
		System.out.println(f);
		f=l; //损失精度
		System.out.println(f);
		d=l; //损失精度
		System.out.println(d);
		f=1.23f;
		d=f; //引入无效位
		System.out.println(d);
	}
}