package overloading;

public class AmbiguousOverloading{
	public double max(int a, double b){
		return (a>b)? a: b;
	}
	public double max(double a, int b){
		return (a>b)? a: b;
	}
	public static void main(String[] args){
		AmbiguousOverloading obj=new AmbiguousOverloading();
		//£¡ System.out.println(obj.max(1,2));
	}
}