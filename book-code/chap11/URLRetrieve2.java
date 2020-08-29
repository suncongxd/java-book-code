
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class URLRetrieve2{
	public static void main(String[] args){
		try{
			URL url=new URL("https://www.xidian.edu.cn/");
			URLConnection conn=url.openConnection();
			BufferedReader br=new BufferedReader(new InputStreamReader(conn.getInputStream()));
			PrintWriter pw=new PrintWriter(new FileWriter("xidian_home2.html"));
			String s;
			while( (s=br.readLine())!=null){
				System.out.println(s);
				pw.println(s);
			}
			br.close();
			pw.close();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}