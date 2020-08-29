package chap10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPriority implements Runnable{
	private int countdown=5;
	private volatile double d;
	private int priority;
	public TestPriority(int prio){
		this.priority=prio;
	}
	public void run(){
		Thread.currentThread().setPriority(this.priority);
		while(countdown!=0){
			for(int i=0;i<100000000;i++){
				d+=(Math.PI+Math.E)/(double)i;
				if(i%1000==0)
					Thread.yield();
			}
			System.out.println(this);
			countdown--;
		}
	}
	public String toString(){
		return Thread.currentThread()+": "+countdown;
	}
	public static void main(String[] args){
		ExecutorService exec=Executors.newCachedThreadPool();
		for(int i=0;i<5;i++)
			exec.execute(new TestPriority(Thread.MIN_PRIORITY));
		exec.execute(new TestPriority(Thread.MAX_PRIORITY));
		exec.shutdown();
/*		for(int i=0;i<5;i++){
			new Thread(new TestPriority(Thread.MIN_PRIORITY)).start();
		}
		new Thread(new TestPriority(Thread.MAX_PRIORITY)).start();*/
	}
}