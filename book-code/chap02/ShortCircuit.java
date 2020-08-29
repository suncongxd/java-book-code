

public class ShortCircuit {
	static boolean bLessThan1(int n) {
		System.out.println("(n<1)? " + (n < 1));
		return (n < 1);
	}
	static boolean bLessThan2(int n) {
		System.out.println("(n<2)? " + (n < 2));
		return (n < 2);
	}
	public static void main(String[] args) {
		System.out.println("Short Circuit:");
		System.out.println( bLessThan1(1) && bLessThan2(1) );
		System.out.println("Not Short Circuit:");
		System.out.println( bLessThan1(1) & bLessThan2(1) );
	}
}