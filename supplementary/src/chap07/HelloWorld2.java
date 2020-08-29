package chap07;

public class HelloWorld2 {
	public static void main(String args[]) {
		int i = 0;
		String greetings[] = { "Hello World", "hello", "HELLO WORLD" };
		while (i < 4) {
			try {
				System.out.println(greetings[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Re-setting Index Value");
				i = -1;
			} finally {
				System.out.println("this is always printed");
			}
			i++;
		}
		System.out.println("Normal End");
	}
}