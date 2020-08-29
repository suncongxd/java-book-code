
import java.io.*;
import java.util.Date;

public class RenameFile {
	private static void fileData(File f) {
		System.out.println(" Absolute path: " + f.getAbsolutePath());
		System.out.println(" Can read: " + f.canRead());
		System.out.println(" Can write: " + f.canWrite());
		System.out.println(" getName: " + f.getName());
		System.out.println(" getParent: " + f.getParent());
		System.out.println(" getPath: "	+ f.getPath());
		System.out.println(" length: " + f.length());
		System.out.println(" lastModified: " + new Date(f.lastModified()));
		if (f.isFile())
			System.out.println("It's a file");
		else
			System.out.println("It's a directory");
	}

	public static void main(String[] args) {
		File old = new File(args[0]);
		File rname = new File(args[1]);
		System.out.println("The original file's information: ");
		fileData(old);
		old.renameTo(rname);

		System.out.println("\nThe file information after rename: ");
		fileData(rname);
		if (!old.exists()) {
			System.out.println("\nThe original file never exists");
		}
	}
}