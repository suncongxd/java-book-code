
import java.net.*;

public class NetworkResolver {
	public static void main(String args[]) {
		try {
			InetAddress addr = InetAddress.getByName("www.sina.com.cn");
			System.out.println ("<Hostname£ºIP address> = <" + 
					addr.getHostName() +"£º"+ addr.getHostAddress() +">" );
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}