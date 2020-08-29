package chap08;
import java.io.*;

public class FilePathOps{
	public static void main(String[] args) throws IOException{
		File parent=new File("E:\\Dir1\\Dir2");
		File absFile=new File(parent,"Dir3\\Dir4\\FileName.java");
		System.out.println(absFile.getName());
		System.out.println(absFile.getParent());
		System.out.println(absFile.getParentFile().toString());
		System.out.println(absFile.getPath());
		System.out.println(absFile.getAbsolutePath());
		System.out.println(absFile.getAbsoluteFile().toString());
		System.out.println(absFile.getCanonicalPath());
		System.out.println(absFile.getCanonicalFile().toString());
		
		File relFile=new File("subdir\\FileName.java");
		System.out.println(relFile.getName());
		System.out.println(relFile.getParent());
		System.out.println(relFile.getParentFile().toString());
		System.out.println(relFile.getPath());
		System.out.println(relFile.getAbsolutePath());
		System.out.println(relFile.getAbsoluteFile().toString());
		System.out.println(relFile.getCanonicalPath());
		System.out.println(relFile.getCanonicalFile().toString());
	}
}