package chap10.pipedio;

import java.io.*;

public class RhymingWords {
	public static void main(String[] args) throws IOException {
		FileReader words = new FileReader("words1.txt");

		// 进行单词的逆序、排序、再逆序还原
		Reader rhymedWords = reverse(sort(reverse(words)));

		BufferedReader in = new BufferedReader(rhymedWords);
		String input;
		while ((input = in.readLine()) != null) {
			System.out.println(input);
		}
		in.close();
	}

	public static Reader reverse(Reader source) throws IOException {
		BufferedReader in = new BufferedReader(source);
		PipedWriter pipeout = new PipedWriter();
		PipedReader pipein = new PipedReader(pipeout);
		PrintWriter out = new PrintWriter(pipeout);
		new ReverseThread(out, in).start();
		return pipein;
	}

	public static Reader sort(Reader source) throws IOException {
		BufferedReader in = new BufferedReader(source);
		PipedWriter pipeout = new PipedWriter();
		PipedReader pipein = new PipedReader(pipeout);
		PrintWriter out = new PrintWriter(pipeout);
		new SortThread(out, in).start();
		return pipein;
	}
}