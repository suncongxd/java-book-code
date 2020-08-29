
import java.net.*;

public class UDPClient{
	private static int BUFSIZE=1024;
	private static int REMOTE_PORT=3001;
	public static void main(String[] args){
		try{
			DatagramSocket ds=new DatagramSocket();
			byte[] buf=new byte[BUFSIZE];
			DatagramPacket dp=new DatagramPacket(buf,buf.length,
					InetAddress.getByName("localhost"), REMOTE_PORT);
			ds.send(dp); //·¢ËÍ
			dp=new DatagramPacket(buf,buf.length);
			ds.receive(dp);
			System.out.println("Received from server <"+
					dp.getAddress().getHostAddress()+","+
					dp.getPort()+">: "+new String(dp.getData(),0,dp.getLength()));
			ds.close();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}