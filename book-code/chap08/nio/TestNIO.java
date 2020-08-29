package nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.*;
public class TestNIO{
	public static void main(String[] args) throws IOException{
		FileInputStream in=new FileInputStream("nio\\TestNIO.java");
		FileOutputStream out=new FileOutputStream("nio\\TestNIO.txt");
		FileChannel cin=in.getChannel();
		FileChannel cout=out.getChannel();
		ByteBuffer buf=ByteBuffer.allocate(256);
		while((cin.read(buf))!=-1){
			buf.flip();
			cout.write(buf);
			buf.clear();
		}
		in.close();
		out.close();
	}
}