package chap06;

import java.io.*;

public class MathDemo {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		double a = 0;
		double b = 0;
		try {
			a = Double.parseDouble(in.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ���� doubleֵ����Ȼ����(������ e)
		System.out.println("LOGE is " + Math.log(a));

		try {
			a = Double.parseDouble(in.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ������ȷ����� doubleֵ����ƽ����:
		System.out.println("SQRT iS " + Math.sqrt(a));
		// ���� doubleֵ��������:
		System.out.println("CBRT is " + Math.cbrt(a));
		// ���� e��a�η�-1
		System.out.println("EXPML is " + Math.expm1(a));

		try {
			a = Double.parseDouble(in.readLine());
			b = Double.parseDouble(in.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		// �������� doubleֵ�нϴ��һ��:
		System.out.println("MAX is " + Math.max(a, b));
		// ����a��b���ݵ�ֵ
		System.out.println("POW is " + Math.pow(a, b));
		// ���� IEEE 754 ��׼�Ĺ涨,����������������������(x���� y������):
		System.out.println("IEEE is " + Math.IEEEremainder(a, b));

		try {
			a = Double.parseDouble(in.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ���ؽǵ���������:
		System.out.println("COS is " + Math.cos(a));
		// ���ز����ķ���.����Ϊ0�򷵻� 0;����>0�򷵻�1.0;����<0�򷵻�-1.0:
		System.out.println("SIGNUM is " + Math.signum(a));
		// ���� doubleֵ��˫��������:
		System.out.println("SINH is " + Math.sinh(a));

		try {
			a = Double.parseDouble(in.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ���� double��ʾ��ʽ��ʹ�õ���ƫָ��:
		System.out.println("GETE is " + Math.getExponent(a));
		// ���� d���������֮����d���ڵĸ���ֵ:
		System.out.println("NEXTUP is " + Math.nextUp(a));
	}
}