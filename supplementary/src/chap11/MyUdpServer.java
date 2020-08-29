package chap11;

import java.io.*;
import java.net.*;

public class MyUdpServer {

	DatagramSocket socket = null;
	BufferedReader in = null;
	boolean moreQuotes = true;

	public void serverWork() throws IOException {

		socket = new DatagramSocket(4445); // �������ݱ�Socket��
		in = new BufferedReader(new FileReader("sentences.txt"));

		while (moreQuotes) {

			// ����������ݱ����������ա�
			byte[] buf = new byte[256];
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			socket.receive(packet);

			/*
			 * ���յ�Client�˵����ݱ�����sentences.txt�ж�ȡһ�У� ��Ϊ��Ӧ���ݱ��е����ݡ�
			 */
			String dString = null;
			if ((dString = in.readLine()) == null) {
				in.close();
				moreQuotes = false;
				dString = "No more sentences. Bye.";
			}
			buf = dString.getBytes();

			/*
			 * �ӽ��յ������ݱ��л�ȡClient�˵ĵ�ַ�Ͷ˿ڣ� ������Ӧ���ݱ������͡�
			 */
			InetAddress address = packet.getAddress();
			int port = packet.getPort();
			packet = new DatagramPacket(buf, buf.length, address, port);
			socket.send(packet);
		}
		socket.close(); // ���о��ӷ�����ϣ��ر�Socket��
	}

	public static void main(String[] args) {
		MyUdpServer server = new MyUdpServer();
		try {
			server.serverWork();
		} catch (IOException e) {
		}
	}
}