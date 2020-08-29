

public class SimpleFormat{
	public static void main(String[] args){
		int x=3;
		float y=2.35f;
		System.out.printf("use printf: (%d,%f)\n", x, y);
		System.out.format("use format: (%d,%f)\n", x, y);
	}
}