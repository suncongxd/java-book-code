
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TestListOfNumbersDeclared {
	public static void main(String args[]) {
		try {
			ListOfNumbersDeclared list = new ListOfNumbersDeclared();
			list.writeList();
		} catch (Exception e) {
		}
		System.out.println("A list of numbers is created and stored in OutFile1.txt");
	}
}

class ListOfNumbersDeclared {
	private ArrayList<Integer> vt;
	private static final int size = 10;

	public ListOfNumbersDeclared() {
		vt = new ArrayList<Integer>(size);
		for (int i = 0; i < size; i++)
			vt.add(new Integer(i));
	}

	public void writeList() throws IOException, IndexOutOfBoundsException {
		PrintWriter out = new PrintWriter(new FileWriter("OutFile1.txt"));
		for (int i = 0; i < size; i++)
			out.println("Value at: " + i + " = " + vt.get(i));
		out.close();
	}
}