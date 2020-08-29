
import java.io.*;
import java.net.*;

public class TCPClient{
	private static int PORT=3000;
	public static void main(String[] args){
		try{
			Socket socket=new Socket("127.0.0.1",PORT);
			System.out.println("Communicate with server <"+
					socket.getInetAddress().getHostAddress()+","+
					socket.getPort()+">");
			BufferedReader in=new BufferedReader( new InputStreamReader(
							socket.getInputStream()));
			PrintWriter out=new PrintWriter(socket.getOutputStream());
			BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));
			String s;
			while(true){
				s=sin.readLine();
				out.println(s);
				out.flush();
				if(!s.equals("quit"))
					System.out.println(in.readLine());
				else 
					break;
			}
			in.close();
			sin.close();
			out.close();
			socket.close();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}