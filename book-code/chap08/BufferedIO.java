
import java.io.*;
public class BufferedIO{
	public static void main(String[] args) throws IOException{
		BufferedReader in=new BufferedReader(new FileReader("BufferedIO.java"));
		PrintWriter out=new PrintWriter(
						new BufferedWriter(
						new FileWriter("BufferedIO.txt")));
		String s;
		int linecnt=1;
		StringBuilder sb=new StringBuilder();
		while((s=in.readLine())!=null){
			sb.append(linecnt+":"+s+"\n");
			out.println(linecnt+":"+s);
			linecnt++;
		}
		in.close();
		out.close();
		System.out.print(sb.toString());
	}
}