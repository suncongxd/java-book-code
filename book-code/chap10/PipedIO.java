

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PipedIO{
	public static void main(String[] args) throws Exception{
		Sender s=new Sender();
		Receiver r=new Receiver(s.getPipedWriter());
		ExecutorService exec=Executors.newCachedThreadPool();
		exec.execute(s);
		exec.execute(r);
		Thread.sleep(1000);
		exec.shutdownNow();
	}
}
class Sender implements Runnable{
	private PipedWriter out=new PipedWriter();
	public PipedWriter getPipedWriter(){
		return this.out;
	}
	public void run(){
		try{
			while(true){
					out.write("hello\n");
					Thread.yield();
			}
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
class Receiver implements Runnable{
	private PipedReader in=new PipedReader();
	public Receiver(PipedWriter o) throws IOException{
		in.connect(o);
	}
	public void run(){
		BufferedReader br=new BufferedReader(in);
		try{
			while(true){
				System.out.println(br.readLine());
			}
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}