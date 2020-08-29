package nio;

import java.nio.*;
import java.nio.channels.FileChannel;
import java.io.*;
public class TestMappedByteBuffer{
	static int length=0xFFFFF; //1MB
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf=new RandomAccessFile("nio\\mbb.dat","rw");
		MappedByteBuffer mbb=raf.getChannel().map(
				FileChannel.MapMode.READ_WRITE,0,length);
		for(int i=0;i<length;i++)
			mbb.put((byte)'x');
		for(int i=length/2;i<length/2+10;i++)
			System.out.print((char)mbb.get(i));
		raf.close();
	}
}