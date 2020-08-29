

public class VariousArgs{
	public double ratingAverage(double r, int ... points){
		int sum=0;
		for(int p: points)
			sum+=p;
		return ((sum*r)/points.length);
	}
	public static void main(String[] args){
		VariousArgs va=new VariousArgs();
		System.out.println( va.ratingAverage(0.5, new int[]{95,90,85}) );
		System.out.println( va.ratingAverage(0.5, 94,92,90,88,86));
	}
}