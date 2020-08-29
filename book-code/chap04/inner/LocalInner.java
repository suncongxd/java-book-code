package inner;

public class LocalInner{
	private int j=3;
	public Object makeInner(final int i){
		int k=4;
		class Inner{
			public String toString(){
				//k=5;		//不能访问方法中非final的局部变量
				return "Inner "+(i+j);	//可以访问外包类的成员变量j
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