package nio;

import java.io.*;
import java.nio.channels.FileChannel;

public class TestNIOSimple{
	public static void main(String[] args) throws IOException{
		FileInputStream in=new FileInputStream("nio\\TestNIOSimple.java");
		FileOutputStream out=new FileOutputStream("nio\\TestNIOSimple.txt");
		FileChannel cin=in.getChannel();
		FileChannel cout=out.getChannel();
		cin.transferTo(0, cin.size(), cout);
		in.close();
		out.close();
	}
}