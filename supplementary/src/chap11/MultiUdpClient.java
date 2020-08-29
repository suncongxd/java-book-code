package chap11;
import java.io.*;
import java.net.*;

public class MultiUdpClient {
	public static void main(String[] args) throws IOException {

		// �����ಥ���ݱ�Socket�������뵽һ���ಥ�顣
		MulticastSocket socket = new MulticastSocket(4446);
		InetAddress group = InetAddress.getByName("228.5.6.7");
		socket.joinGroup(group);

		// ��Server�˽���5�����ݱ�������ʾ���ݱ��е����ݡ�
		DatagramPacket packet;
		for (int i = 0; i < 5; i++) {
			byte[] buf = new byte[256];
			packet = new DatagramPacket(buf, buf.length);
			socket.receive(packet);

			String received = new String(packet.getData());
			System.out.println("The sentence send by the server: \n    "
					+ received);
		}

		socket.leaveGroup(group); // �뿪�ಥ�顣
		socket.close(); // �ر�Socket��
	}
}
