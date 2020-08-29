

public class EnhancedFor{
	public static void main(String[] args){
		String[] ss={"Alice","Bob","Tom"};
		for(String s: ss){
			System.out.println(s);
		}
		
		int[] a={1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int c: a){
			sum+=c;
		}
		System.out.println(sum);
	}
}