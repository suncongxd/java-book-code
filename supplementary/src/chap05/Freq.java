package chap05;

import java.util.*;

public class Freq {

	public static void main(String args[]) {
		String[] words = { "if", "it", "is", "to", "be", "it", "is", "up",
				"to", "me", "to", "delegate" };
		Integer freq;
		Map<String, Integer> m = new TreeMap<String, Integer>();

		// �����ַ�������words�ĵ���Ƶ�ʱ�.�Ե���Ϊkey,�Դ�ƵΪvalue��
		for (String a : words) {
			freq = m.get(a); // ��ȡָ�����ʵĴ�Ƶ��

			// ��Ƶ����
			if (freq == null) {
				freq = new Integer(1);
			} else {
				freq = new Integer(freq + 1);
			}
			m.put(a, freq); // ��Map�и��Ĵ�Ƶ��
		}

		System.out.println(m.size() + " distinct words detected:");
		System.out.println(m);
	}
}
