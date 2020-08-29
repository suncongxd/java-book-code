import java.net.*;

public class LocalHost {
	public static void main(String[] args){
		try {
			InetAddress localAddress=InetAddress.getLocalHost();
			System.out.println ("IP address of localhost: " + localAddress.getHostAddress() );
		}
		catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}