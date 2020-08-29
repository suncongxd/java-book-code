
class MyException extends Exception {
	MyException() { }
	MyException(String msg) {
		super(msg);
	}
}
class UsingMyException {
	static void f() throws MyException {
		System.out.println("Throws MyException from f()");
		throw new MyException();
	}
	static void g() throws MyException {
		System.out.println("Throws MyException from g()");
		throw new MyException("Originated in g()");
	}
}
public class TestMyException {
	public static void main(String[] args) {
		try {
			UsingMyException.f();
		} catch (MyException e) {
			e.printStackTrace(System.out);
		}
		try {
			UsingMyException.g();
		} catch (MyException e) {
			e.printStackTrace(System.out);
		}
	}
}