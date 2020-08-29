

public class CastRoundingNum{
	public static void main(String[] args){
		double a = 0.7;
		double b = 0.4;
		float fa = 0.7f;
		float fb = 0.4f;
		System.out.println("(int)a: " + (int) a);
		System.out.println("(int)b: " + (int) b);
		System.out.println("(int)fa: " + (int) fa);
		System.out.println("(int)fb: " + (int) fb);
		System.out.println("Math.round(a): " + Math.round(a));
		System.out.println("Math.round(b): " + Math.round(b));
		System.out.println("Math.round(fa): " + Math.round(fa));
		System.out.println("Math.round(fb): " + Math.round(fb));
	}
}