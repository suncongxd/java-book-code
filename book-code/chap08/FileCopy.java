

import java.io.*;

public class FileCopy{
	public static void main(String[] args) throws IOException{
		FileInputStream in=new FileInputStream("FileCopy.java");
		FileOutputStream out=new FileOutputStream("FileCopy.txt");
		int c;
		while( (c=in.read())!=-1){
			out.write(c);
		}
		in.close();
		out.close();
	}
}