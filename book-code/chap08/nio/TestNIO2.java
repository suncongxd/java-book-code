package nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.*;

public class TestNIO2{
	public static void main(String[] args) throws IOException{
		FileOutputStream o=new FileOutputStream("nio\\data2.txt");
		RandomAccessFile r=new RandomAccessFile("nio\\data2.txt", "rw");
		FileInputStream i=new FileInputStream("nio\\data2.txt");
		
		FileChannel fc=o.getChannel();
		fc.write(ByteBuffer.wrap("Hello ".getBytes()));
		fc.close();
		fc=r.getChannel();
		fc.position(fc.size());
		fc.write(ByteBuffer.wrap("World!".getBytes()));
		fc.close();
		fc=i.getChannel();
		ByteBuffer buf=ByteBuffer.allocate(256);
		fc.read(buf);
		buf.flip();
		while(buf.hasRemaining())
			System.out.print((char)buf.get());
		
		o.close();
		r.close();
		i.close();
	}
}