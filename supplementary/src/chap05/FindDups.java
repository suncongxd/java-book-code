package chap05;

import java.util.*;

public class FindDups {
	public static void main(String args[]) {
		Set<String> s = new HashSet<String>();// ����һ��HashSet����ȱʡ�ĳ�ʼ������16��

		for (int i = 0; i < args.length; i++) {
			// ���������е�ÿ���ַ������뵽����s�У������ظ����ַ��������ܼ��룬������ӡ�����
			if (!s.add(args[i]))
				System.out.println("Duplicate detected: " + args[i]);
		}

		System.out.println(s.size() + " distinct words detected: " + s);// �������s��Ԫ�ظ����Լ������е�����Ԫ�ء�
	}
}
