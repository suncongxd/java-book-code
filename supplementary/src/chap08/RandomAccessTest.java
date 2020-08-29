package chap08;
import java.io.*;

public class RandomAccessTest {
	public static void main(String[] args) throws IOException {
		long filePoint = 0;
		String s;
		RandomAccessFile file = new RandomAccessFile("src\\chap08\\RandomAccessTest.java",
				"r");
		long fileLength = file.length(); // ��ȡ�ļ�����
		while (filePoint < fileLength) {
			s = file.readLine(); // ��һ���ַ������ƶ��ļ�ָ��
			System.out.println(s); // �����ʾ�����һ���ַ�
			file.skipBytes(5);
			filePoint = file.getFilePointer(); // ��ȡ��ǰ�ļ�ָ��
		}
		file.close();
	}
}