

import java.io.*;

public class RandomAccessFileDemo{
	static String file="raf.dat";
	
	private static void display() throws IOException{
		RandomAccessFile raf=new RandomAccessFile(file,"r");
		for(int i=0;i<7;i++)
			System.out.println("Value "+i+": "+raf.readDouble());
		System.out.println(raf.readUTF());
		raf.close();
	}
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf=new RandomAccessFile(file,"rw");
		for(int i=0;i<7;i++)
			raf.writeDouble(i*1.414);
		raf.writeUTF("end of file");
		raf.close();
		display();
		
		raf=new RandomAccessFile(file,"rw");
		raf.seek(5*8);
		raf.writeDouble(47.001);
		raf.close();
		display();
	}
}