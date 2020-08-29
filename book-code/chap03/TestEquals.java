

public class TestEquals{
	public static void main(String[] args){
		IntNum n1=new IntNum(1);
		IntNum n2=new IntNum(1);
		System.out.println(n1.equals(n2));
		LongNum l1=new LongNum(2);
		LongNum l2=new LongNum(2);
		System.out.println(l1.equals(l2));
		String s1=new String("Hello");
		String s2=new String("Hello");
		System.out.println(s1.equals(s2));
	}
}
class IntNum{
	int i;
	public IntNum(int n){
		i=n;
	}
}
class LongNum{
	long l;
	public LongNum(long n){
		l=n;
	}
	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass())
			return false;
		if (l != ((LongNum) obj).l)
			return false;
		return true;
	}
/*	Eclipse自动生成的hashCode()和equals()方法
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (l ^ (l >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LongNum other = (LongNum) obj;
		if (l != other.l)
			return false;
		return true;
	}*/	
}