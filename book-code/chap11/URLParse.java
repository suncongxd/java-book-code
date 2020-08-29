
import java.net.*;
public class URLParse{
	public static void main(String[] args){
		try{
			URL url=new URL("https://groups.google.com:80/forum/#!forum/secure-android-update");
			System.out.println("protocol: "+url.getProtocol());
			System.out.println("host: "+url.getHost());
			System.out.println("port: "+url.getPort());
			System.out.println("pathname: "+url.getPath());
			System.out.println("reference: "+url.getRef());
		} catch (MalformedURLException e){
			e.printStackTrace();
		}
	}
}