package chap03;

public class PrivOverride {
	private void f() {
		System.out.println("private f()");
	}

	public static void main(String[] args) {
		PrivOverride po = new Derived();
		po.f();
	}
}

class Derived extends PrivOverride {
	public int a;

	public void f() {
		System.out.println("public f()");
	}
} /*
 * Output: private f()
 */// :~