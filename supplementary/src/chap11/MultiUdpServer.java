package chap11;
import java.io.*;
import java.net.*;

public class MultiUdpServer {

	DatagramSocket socket = null;
	BufferedReader in = null;
	boolean moreQuotes = true;

	public void serverWork() throws IOException {

		socket = new DatagramSocket(4445); // �������ݱ�Socket��
		in = new BufferedReader(new FileReader("sentences.txt"));

		while (moreQuotes) {
			byte[] buf = new byte[256];
			DatagramPacket packet;

			/* ��sentences.txt�ж�ȡһ�У���Ϊ���ݱ��е����ݡ� */
			String dString = null;
			if ((dString = in.readLine()) == null) {
				in.close();
				moreQuotes = false;
				dString = "No more sentences. Bye.";
			}
			buf = dString.getBytes();

			/* ���췢���ಥ������ݱ������� */
			InetAddress group = InetAddress.getByName("228.5.6.7");
			packet = new DatagramPacket(buf, buf.length, group, 4446);
			socket.send(packet);

			try {
				Thread.sleep(5000); // ���5���ӡ�
			} catch (InterruptedException e) {
			}

		}
		socket.close(); // ���о��ӷ�����ϣ��ر�Socket��
	}

	public static void main(String[] args) {
		MultiUdpServer server = new MultiUdpServer();
		try {
			server.serverWork();
		} catch (IOException e) {
		}
	}
}