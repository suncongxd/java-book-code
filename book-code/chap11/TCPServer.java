
import java.io.*;
import java.net.*;

public class TCPServer{
	private static int PORT=3000;
	public static void main(String[] args){
		try{
			ServerSocket ss=new ServerSocket(PORT);
			Socket socket=ss.accept();
			System.out.println("Connected with client <"+
					socket.getInetAddress().getHostAddress()+","+
					socket.getPort()+">");
			BufferedReader in=new BufferedReader( new InputStreamReader(
							socket.getInputStream()));
			PrintWriter out=new PrintWriter(socket.getOutputStream());
			String s;
			while(!(s=in.readLine()).equals("quit")){
				System.out.println("Received from client: "+s);
				out.println("Server reply: "+s);
				out.flush();
			}
			in.close();
			out.close();
			socket.close();
			ss.close();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}