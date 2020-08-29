package chap03;

public class PassTest {
	float ptValue;

	// ���������ǻ�������
	public void changeInt(int value) {
		value = 55;
	}

	// ���������������ͣ����ҷ����и��˱������ֵ
	public void changeStr(String value) {
		value = new String("different");
	}

	// ���������������ͣ����ҷ����и��˱������ָ�����ĳ�Ա����ֵ
	public void changeObjValue(PassTest ref) {
		ref.ptValue = 99.0f;
	}

	public static void main(String args[]) {
		String str;
		int val;

		PassTest pt = new PassTest(); // ����PassTest�Ķ���

		// ���Ի������Ͳ����Ĵ��ݣ��۲���ó����еı���ֵ�Ƿ�ı�
		val = 11;
		pt.changeInt(val);
		System.out.println("Int value is: " + val);

		// �����������Ͳ����Ĵ��ݣ��۲���ó����еı���ֵ�Ƿ�ı�
		str = new String("Hello");
		pt.changeStr(str);
		System.out.println("Str value is: " + str);

		// �����������Ͳ����Ĵ��ݣ��۲���ó����еı���ֵ�Ƿ�ı�
		pt.ptValue = 101.0f;
		pt.changeObjValue(pt);
		System.out.println("Pt value is: " + pt.ptValue);
	}
}
