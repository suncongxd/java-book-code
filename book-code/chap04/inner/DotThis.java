package inner;

public class DotThis{
	public class Inner{
		public DotThis outer(){
			return DotThis.this;
		}
	}
	public Inner buildInner(){
		return new Inner();
	}
	public void f(){
		System.out.println("DotThis.f()");
	}
	public static void main(String[] args){
		DotThis dt=new DotThis();
		Inner dti=dt.buildInner();
		dti.outer().f();
		
		Inner dti2=dt.new Inner();
		dti2.outer().f();
	}
}