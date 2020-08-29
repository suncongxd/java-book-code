package chap06;

public class TestConversion {
	public static void main(String args[]) {
		int intvar = 1;
		long lngvar = 99999999;
		float fltvar = 9.99f;
		double dblvar = 99999999.99;
		char chrvar = 'a';
		boolean boolvar = true;
		byte bvar = 3;
		short svar = 4;
		// �ӻ�����������ת����String
		String strvar, total;

		strvar = String.valueOf(intvar);
		total = strvar + "\n";

		strvar = String.valueOf(lngvar);
		total = total + strvar + "\n";

		strvar = String.valueOf(fltvar);
		total = total + strvar + "\n";

		strvar = String.valueOf(dblvar);
		total = total + strvar + "\n";

		strvar = String.valueOf(chrvar);
		total = total + strvar + "\n";

		strvar = String.valueOf(boolvar);
		total = total + strvar + "\n";

		// ע:Stringû��valueOf��byte,shortת��ΪString
		// ��ʽת����ʹ��valueOf(int)
		strvar = String.valueOf(bvar);
		total = total + strvar + "\n";

		strvar = String.valueOf(svar);
		total = total + strvar + "\n";

		System.out.print(total);
		System.out.println("************");

		// ��Stringת����������������
		strvar = "10";
		intvar = Integer.parseInt(strvar);
		System.out.println(intvar);

		strvar = "99999999";
		lngvar = Long.parseLong(strvar);
		System.out.println(lngvar);

		strvar = "10.1f";
		fltvar = Float.parseFloat(strvar);
		System.out.println(fltvar);

		strvar = "99999999.9";
		dblvar = Double.parseDouble(strvar);
		System.out.println(dblvar);

		// Character�಻���ڽ�String��charת����parse����
		// ����ʹ��String��charAt��������String��ĳ���ַ�
		strvar = "abc";
		chrvar = strvar.charAt(1);
		System.out.println(chrvar);

		strvar = "false";
		boolvar = Boolean.parseBoolean(strvar);
		System.out.println(boolvar ? "true" : "false");

		strvar = "3";
		bvar = Byte.parseByte(strvar);
		System.out.println(bvar);

		strvar = "4";
		svar = Short.parseShort(strvar);
		System.out.println(svar);

	}
}