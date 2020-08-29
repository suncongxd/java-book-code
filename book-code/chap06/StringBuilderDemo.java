

public class StringBuilderDemo {
	public static void main(String args[]) {
		// 构造方法
		StringBuilder StrA = new StringBuilder();
		StringBuilder StrB = new StringBuilder("ABCDEFG");
		StringBuilder StrC = new StringBuilder(10);
		CharSequence cs = "hello";
		StringBuilder StrD = new StringBuilder(cs);
		System.out.println("length of " + StrA + ": " + StrA.length() +
				"; capacity of " + StrA+":"+StrA.capacity());
		System.out.println("length of " + StrB + ": " + StrB.length() +
				"; capacity of " + StrB+":"+StrB.capacity());
		System.out.println("length of " + StrC + ": " + StrC.length() +
				"; capacity of " + StrC+":"+StrC.capacity());//length()返回的是实际字符序列长度
		System.out.println("length of " + StrD + ": " + StrD.length() +
				"; capacity of " + StrD+":"+StrD.capacity());
		System.out.println();

		// append追加新串至末尾, append方法几乎重载了任何参数形式
		StrA.append(false); // 末尾追加boolean常量
		StrA.append(" abc "); // 末尾追加String
		StrA.append(100); // 追加整数
		StrA.append(' '); // 字符
		StrA.append(new char[] { '1', '2', '3', ' ' }); //数组
		char charArray[] = new char[5];
		charArray[0] = charArray[1] = charArray[2] = 'x';
		StrA.append(charArray, 0, 3); // 指定添加起始位置和长度
		System.out.println(StrA.toString()); // 转化StringBuilder为String
		System.out.println();

		// insert, 在指定位置插入特定类型值
		StrB.insert(0, true);// 插入boolean型
		System.out.println("length of "+StrB+": " + StrB.length());
		StrB.insert(4, ' ');// 插入字符
		System.out.println("length of "+StrB+": " + StrB.length());
		charArray[0] = charArray[2] = charArray[4] = '-';
		charArray[1] = charArray[3] = '*';
		StrB.insert(0, charArray, 2, 3);// 在位置0插入字符数组从下标2开始长度为3的部分
		System.out.println("length of "+StrB+": " + StrB.length());
		cs = "_hello_";// 插入字符串
		StrB.insert(3, cs);
		System.out.println("length of "+StrB+": " + StrB.length());
		StrB.insert(10, cs, 1, 6);//在下标10的位置插入从cs串[1,6)的部分
		System.out.println("length of "+StrB+": " + StrB.length());
	}
}
