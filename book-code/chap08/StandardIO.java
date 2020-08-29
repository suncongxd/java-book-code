
import java.io.*;
public class StandardIO{
	public static void main(String[] args) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String s;
		PrintWriter out=new PrintWriter(System.out, true);
		while((s=in.readLine())!=null && s.length()!=0){
			System.out.println("Read from keyboard: "+s);
			out.println("Through PrintWriter: "+s);
		}
	}
}