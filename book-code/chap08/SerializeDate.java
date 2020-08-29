
import java.util.*;
import java.io.*;

public class SerializeDate {
	public static void main(String args[]) throws IOException{
		Date d = new Date();
		ObjectOutputStream out = new ObjectOutputStream(
						new FileOutputStream("date.dat"));
		out.writeObject(d);
		out.close();
	}
}