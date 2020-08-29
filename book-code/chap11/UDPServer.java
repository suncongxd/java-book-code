
import java.net.*;
import java.io.*;

public class UDPServer{
	private static int PORT=3001;
	private static int BUFSIZE=1024;
	public static void main(String[] args){
		try{
			DatagramSocket ds=new DatagramSocket(PORT);
			byte[] buf=new byte[BUFSIZE];
			DatagramPacket dp=new DatagramPacket(buf,buf.length);
			ds.receive(dp);
			InetAddress ia=dp.getAddress();
			int port=dp.getPort();
			System.out.println("Typing sentence to client <"+
							ia.getHostAddress()+","+port+">:");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			buf=br.readLine().getBytes();
			dp=new DatagramPacket(buf,buf.length,ia,port);
			ds.send(dp);
			br.close();
			ds.close();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}