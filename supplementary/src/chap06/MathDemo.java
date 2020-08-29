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
		// 返回 double值的自然对数(底数是 e)
		System.out.println("LOGE is " + Math.log(a));

		try {
			a = Double.parseDouble(in.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 返回正确舍入的 double值的正平方根:
		System.out.println("SQRT iS " + Math.sqrt(a));
		// 返回 double值的立方根:
		System.out.println("CBRT is " + Math.cbrt(a));
		// 返回 e的a次方-1
		System.out.println("EXPML is " + Math.expm1(a));

		try {
			a = Double.parseDouble(in.readLine());
			b = Double.parseDouble(in.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 返回两个 double值中较大的一个:
		System.out.println("MAX is " + Math.max(a, b));
		// 返回a的b次幂的值
		System.out.println("POW is " + Math.pow(a, b));
		// 按照 IEEE 754 标准的规定,对两个参数进行余数运算(x除以 y的余数):
		System.out.println("IEEE is " + Math.IEEEremainder(a, b));

		try {
			a = Double.parseDouble(in.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 返回角的三角余弦:
		System.out.println("COS is " + Math.cos(a));
		// 返回参数的符号.参数为0则返回 0;参数>0则返回1.0;参数<0则返回-1.0:
		System.out.println("SIGNUM is " + Math.signum(a));
		// 返回 double值的双曲线正弦:
		System.out.println("SINH is " + Math.sinh(a));

		try {
			a = Double.parseDouble(in.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 返回 double表示形式中使用的无偏指数:
		System.out.println("GETE is " + Math.getExponent(a));
		// 返回 d和正无穷大之间与d相邻的浮点值:
		System.out.println("NEXTUP is " + Math.nextUp(a));
	}
}