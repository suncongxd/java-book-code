

public class ArrayCopy {
	public static void main(String[] args) {
		char[] src = { 'h', 'o', 'w', ' ', 'a', 'r', 'e', ' ', 'y', 'o', 'u' };
		char[] target = new char[3];
		System.arraycopy(src, 4, target, 0, 3);
		System.out.println(new String(target));
	}
}