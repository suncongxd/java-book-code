package inner;

public class LocalInner{
	private int j=3;
	public Object makeInner(final int i){
		int k=4;
		class Inner{
			public String toString(){
				//k=5;		//���ܷ��ʷ����з�final�ľֲ�����
				return "Inner "+(i+j);	//���Է��������ĳ�Ա����j
			}
		}
		return new Inner();
	}
	public static void main(String[] args){
		LocalInner li=new LocalInner();
		Object obj=li.makeInner(2);
		System.out.println(obj.toString());
	}
}