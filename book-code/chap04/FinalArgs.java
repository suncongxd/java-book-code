

public class FinalArgs{
	public void mtd(final int i, final Arg arg1, Arg arg2){
		//i++;				//i��ֵ���ܸ���
		//arg1=new Arg();	//arg��ָ���ܸ���
		arg2=new Arg();
		if(arg1!=null)
			System.out.println(i+ (++arg1.n) + arg2.n );
	}
	public static void main(String[] args){
		FinalArgs fa=new FinalArgs();
		fa.mtd(1, new Arg(), null);
	}
}
class Arg{ 
	int n=3;
}
