

import java.util.*;
import java.io.*;

public class UnSerializeDate {
	public static void main(String[] args) 
			throws IOException, ClassNotFoundException{
		ObjectInputStream in = new ObjectInputStream(
								new FileInputStream("date.dat"));
		Object o = in.readObject();
		in.close();
		if(o instanceof Date)
			System.out.println(((Date)o).toString());
	}
}