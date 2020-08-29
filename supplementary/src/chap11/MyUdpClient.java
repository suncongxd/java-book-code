package chap11;

import java.io.*;
import java.net.*;

public class MyUdpClient {
	public static void main(String[] args) throws IOException {

		// �������ݱ�Socket��
		DatagramSocket socket = new DatagramSocket();

		// �����������ݱ������͡�
		byte[] buf = new byte[256];
		InetAddress address = InetAddress.getByName("localhost");
		DatagramPacket packet = new DatagramPacket(buf, buf.length, address,
				4445);
		socket.send(packet);

		// ����������ݱ����������ա�
		packet = new DatagramPacket(buf, buf.length);
		socket.receive(packet);

		// �յ�Server����Ӧ���ݱ�����ȡ���ݲ���ʾ��
		String received = new String(packet.getData());
		System.out
				.println("The sentence send by the server: \n    " + received);

		socket.close(); // �ر�Socket��
	}
}
