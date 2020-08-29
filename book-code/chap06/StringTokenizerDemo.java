
import java.util.*;

public class StringTokenizerDemo {
	public static void main(String args[]) {
		String str = "��ѧ::Ӣ��::����::��ѧ";
		StringTokenizer st = new StringTokenizer(str, "::");
		System.out.println("�γ�����" + st.countTokens());
		while (st.hasMoreTokens())
			System.out.print(st.nextToken()+"; ");
		System.out.println();

		String[] result = str.split("::");
	    for (int x=0; x<result.length; x++)
	    	System.out.print(result[x]+"; ");
	    System.out.println();
	     
	    Scanner scanner=new Scanner(str);
	    scanner.useDelimiter("::");
	    while(scanner.hasNext()){
	    	System.out.print(scanner.next()+"; ");
	    }
	    scanner.close();
	}
}