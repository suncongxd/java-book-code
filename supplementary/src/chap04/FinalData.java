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
	
	//��������
	private final int valueOne = 9;				// ����ʱ����
	private final int i4 = rand.nextInt(20);	// ����ʱ���ɱ�,�����Ǳ���ʱ����

	//�������ͺ���������
	private Value v1 = new Value(11);
	private final Value v2 = new Value(22);
	private final int[] a = { 1, 2, 3, 4, 5, 6 };
	
	public static void main(String[] args) {
		FinalData fd1 = new FinalData();

		//fd1.valueOne++; //valueOne���ܸ���
		//fd1.i4++; //i4���ܸ���

		fd1.v1 = new Value(9);// v1����final��,������ÿ���ָ���µĶ���

		// fd1.v2=new Value(0); //v2��final��,�������õ��µĶ���
		fd1.v2.i++;// �������ò��ܸ���,����������Ը���

		// fd1.a=new int[3];//����a��final��,�������õ��µ�����
		for (int i = 0; i < fd1.a.length; i++) {
			fd1.a[i]++; // ����a��final��,������Ԫ�ز���final��
		}
	}
}