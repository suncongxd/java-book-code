

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.StringReader;

public class ScannerDemo{
	public static void main(String[] args){
		Scanner scanner=new Scanner(new BufferedReader(new StringReader(
						"This dataset inlcudes 100 Web services located in more than \n"
						+ "20 countries \nand 150 distributed computers from Planet-Lab.")));
		String line=scanner.nextLine();
		System.out.println(line);
		
		int count=scanner.nextInt();
		String word=scanner.next();
		System.out.format("*%d %s* ",count, word);

		word=scanner.next();
		System.out.println(word.toUpperCase());
		System.out.println(scanner.nextLine());
		scanner.close();
	}
}