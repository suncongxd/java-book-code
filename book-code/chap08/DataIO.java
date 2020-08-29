

import java.io.*;

public class DataIO{
	public static void main(String[] args) throws IOException{
		DataOutputStream out=new DataOutputStream(
							new BufferedOutputStream(
							new FileOutputStream("data.txt")));
		out.writeBoolean(false);
		out.writeChar('c');
		out.writeByte(1);
		out.writeShort(2);
		out.writeInt(3);
		out.writeLong(4L);
		out.writeFloat(5.0f);
		out.writeDouble(6.0);
		out.writeUTF("hello world!");
		out.close();
		
		DataInputStream in=new DataInputStream(
							new BufferedInputStream(
							new FileInputStream("data.txt")));
		System.out.println(in.readBoolean());
		System.out.println(in.readChar());
		System.out.println(in.readByte());
		System.out.println(in.readShort());
		System.out.println(in.readInt());
		System.out.println(in.readLong());
		System.out.println(in.readFloat());
		System.out.println(in.readDouble());
		System.out.println(in.readUTF());
		in.close();
	}
}