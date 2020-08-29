package chap06;

import java.util.*;

public class TestScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, data;
		while ((data = sc.nextInt()) != 0)
			sum += data;
		System.out.println(sum);
	}
}