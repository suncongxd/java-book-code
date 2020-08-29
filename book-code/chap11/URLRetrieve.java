
import java.net.*;
import java.io.*;

public class URLRetrieve{
	public static void main(String[] args){
		try{
			URL url=new URL("https://www.xidian.edu.cn");
			BufferedReader br=new BufferedReader(new InputStreamReader(url.openStream()));
			PrintWriter pw=new PrintWriter(new FileWriter("xidian_home.html"));
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