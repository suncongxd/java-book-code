package chap04;
import java.util.*;

class Value {
	int i;

	public Value(int i) {
		this.i = i;
	}
}

public class FinalData {
	private static Random rand = new Random(47);
	
	//基本类型
	private final int valueOne = 9;				// 编译时常量
	private final int i4 = rand.nextInt(20);	// 运行时不可变,但不是编译时常量

	//引用类型和数组类型
	private Value v1 = new Value(11);
	private final Value v2 = new Value(22);
	private final int[] a = { 1, 2, 3, 4, 5, 6 };
	
	public static void main(String[] args) {
		FinalData fd1 = new FinalData();

		//fd1.valueOne++; //valueOne不能更改
		//fd1.i4++; //i4不能更改

		fd1.v1 = new Value(9);// v1不是final的,因此引用可以指向新的对象

		// fd1.v2=new Value(0); //v2是final的,不能引用到新的对象
		fd1.v2.i++;// 对象引用不能更改,但对象本身可以更改

		// fd1.a=new int[3];//数组a是final的,不能引用到新的数组
		for (int i = 0; i < fd1.a.length; i++) {
			fd1.a[i]++; // 数组a是final的,但数组元素不是final的
		}
	}
}