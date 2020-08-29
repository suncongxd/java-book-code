
import java.io.*;
public class DataInputEOF{
	public static void main(String[] args) throws IOException{
		DataInputStream in=new DataInputStream(new BufferedInputStream(
				new FileInputStream("DataInputEOF.java")));
		while(in.available()!=0)
			System.out.print((char)in.readByte());
		in.close();
	}
}