
import java.io.*;
import java.util.*;

public class ListOfNumbers {
	private ArrayList<Integer> vt;
	private static final int size = 10;

	public ListOfNumbers() {
		vt = new ArrayList<Integer>(size);
		for (int i = 0; i < size; i++)
			vt.add(new Integer(i));
	}

	
	/*public void writeList(){ 
		 PrintWriter out=new PrintWriter(new FileWriter("OutFile.txt")); 
		 for (int i=0;i<size;i++)
			 out.println("Value at: "+i+" = "+vt.get(i)); 
		 out.close(); 
	}*/

	// 对前一个writeList的改进，加入try-catch-finally异常处理
	/*public void writeList() {
		PrintWriter out = null;
		try {
			System.out.println("Entering try statement");
			out = new PrintWriter(new FileWriter("OutFile.txt"));
			for (int i = 0; i < size; i++)
				out.println("Value at: " + i + " = " + vt.get(i));
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Caught IndexOutOfBoundsException: "
					+ e.getMessage());
		} catch (IOException e) {
			System.err.println("Caught IOException: " + e.getMessage());
		} finally {
			if (out != null) {
				System.out.println("Closing PrintWriter");
				out.close();
			} else {
				System.out.println("PrintWriter not open");
			}
		}
	}*/
	

	// 处理多种异常
	public void writeList() { 
		PrintWriter out = null; 
		try {
			System.out.println("Entering try statement"); 
			out=new PrintWriter(new FileWriter("OutFile.txt")); 
			for (int i=0;i<size;i++)
				out.println("Value at: "+i+" = "+vt.get(i)); 
		} catch (IOException e) { 
			System.err.println("Caught IOException: " + e.getMessage()); 
		} catch	(Exception e){ 
			System.err.println("Caught Exception: "+e.getMessage()); 
		} finally { 
			if (out!=null) { 
				System.out.println("Closing PrintWriter");
				out.close(); 
			} else { 
				System.out.println("PrintWriter not open"); 
			} 
		} 
	}
	
	public static void main(String args[]) {
		ListOfNumbers list = new ListOfNumbers();
		list.writeList();
	}
}