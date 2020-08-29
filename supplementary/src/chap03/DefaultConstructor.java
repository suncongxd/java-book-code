package chap03;

class Bird {
	int i;

	public Bird(int j){ i=j; }
}

public class DefaultConstructor {
	public static void main(String[] args) {
		Bird nc = new Bird(5); // Default!
	}
} // /:~