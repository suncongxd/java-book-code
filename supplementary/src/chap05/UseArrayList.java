package chap05;

import java.util.ArrayList;
import java.util.List;

//����Vector���󣬽���Ԫ�ص���ӡ����롢�޸ĺ�ɾ��
public class UseArrayList {
	public static void main(String[] args) {
		List<String> scores = new ArrayList<String>();
		scores.add("86");// ���Ԫ��
		scores.add("98");// ���Ԫ��
		scores.add(1, "99");// ����Ԫ��
		for (int i = 0; i < scores.size(); i++) {
			System.out.print(scores.get(i) + " ");// ������
		}
		scores.set(1, "77");// �޸ĵڶ���Ԫ��
		scores.remove(0);// ɾ����һ��Ԫ��
		System.out.println("\n�޸Ĳ�ɾ��֮��");
		for (int i = 0; i < scores.size(); i++) {
			System.out.print(scores.get(i) + " ");
		}
		System.out.println(" \n���ַ������\n" + scores.toString());
	}
}