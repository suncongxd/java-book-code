package chap07;

public class AssertionDemo {
	static void test1() {
		int month = 13;
		switch (month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			assert false : "Hey, that's not a valid month!";
			break;
		}
	}

	static void test2(String s) {
		assert s != null : "param is null in test()";
		System.out.println("in test2");
	}

	static int abs(int i) {
		return i;
	}

	static void test3() {
		int i = -5;
		int j = abs(i);// java.lang.Math.abs(i);
		assert j >= 0 : "value should be bigger than 0:" + j;
	}

	public static void main(String[] args) {
		AssertionDemo.test1();
	}
}