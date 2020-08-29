

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDown4 implements Runnable{
	private static int idcnt=1;
	private final int threadid=idcnt++;
	int counter=3;
	public void run(){
		while(counter>=0){
			try{ 
				Thread.sleep(1000);
			} catch (Exception e){
				e.printStackTrace();
			}
			System.out.println("#"+threadid+(counter>0?"->"+counter:"->run!"));
			counter--;
		}
	}
	public static void main(String[] args){
		ExecutorService exec=Executors.newCachedThreadPool();
		exec.execute(new CountDown4());
		exec.execute(new CountDown4());
		exec.shutdown();
		System.out.println("waiting for run...");
	}
}
