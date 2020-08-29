

public class StringBuilderDemo {
	public static void main(String args[]) {
		// ���췽��
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
				"; capacity of " + StrC+":"+StrC.capacity());//length()���ص���ʵ���ַ����г���
		System.out.println("length of " + StrD + ": " + StrD.length() +
				"; capacity of " + StrD+":"+StrD.capacity());
		System.out.println();

		// append׷���´���ĩβ, append���������������κβ�����ʽ
		StrA.append(false); // ĩβ׷��boolean����
		StrA.append(" abc "); // ĩβ׷��String
		StrA.append(100); // ׷������
		StrA.append(' '); // �ַ�
		StrA.append(new char[] { '1', '2', '3', ' ' }); //����
		char charArray[] = new char[5];
		charArray[0] = charArray[1] = charArray[2] = 'x';
		StrA.append(charArray, 0, 3); // ָ�������ʼλ�úͳ���
		System.out.println(StrA.toString()); // ת��StringBuilderΪString
		System.out.println();

		// insert, ��ָ��λ�ò����ض�����ֵ
		StrB.insert(0, true);// ����boolean��
		System.out.println("length of "+StrB+": " + StrB.length());
		StrB.insert(4, ' ');// �����ַ�
		System.out.println("length of "+StrB+": " + StrB.length());
		charArray[0] = charArray[2] = charArray[4] = '-';
		charArray[1] = charArray[3] = '*';
		StrB.insert(0, charArray, 2, 3);// ��λ��0�����ַ�������±�2��ʼ����Ϊ3�Ĳ���
		System.out.println("length of "+StrB+": " + StrB.length());
		cs = "_hello_";// �����ַ���
		StrB.insert(3, cs);
		System.out.println("length of "+StrB+": " + StrB.length());
		StrB.insert(10, cs, 1, 6);//���±�10��λ�ò����cs��[1,6)�Ĳ���
		System.out.println("length of "+StrB+": " + StrB.length());
	}
}
