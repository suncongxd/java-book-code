package chap03;

class Window {
	Window(int m) {
		System.out.println("window " + m);
	}
}

class House {
	Window w1 = new Window(1);

	House() {
		System.out.println("House");
		w3 = new Window(33);
	}

	Window w2 = new Window(2);

	void f() {
		System.out.println("f()");
	}

	Window w3 = new Window(3);
}

public class OrderOfInit {
	public static void main(String[] args) {
		House h = new House();
		h.f();
	}
}