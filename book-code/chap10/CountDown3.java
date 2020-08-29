

public class CountDown3{
	static int idcnt=1;
	public static void main(String[] args){
		new SubThread().start();
		new Thread(new Run()).start();
	}
}
class SubThread extends Thread{
	private final int threadid=CountDown3.idcnt++;
	public void run(){
		try{
			Thread.sleep(1000);
		} catch (Exception e){
			e.printStackTrace();
		}
		System.out.println("#"+threadid);
	}
}
class Parent{
	public void doSth(){
		System.out.println("do something ...");
	}
}
class Run extends Parent implements Runnable{
	private final int threadid=CountDown3.idcnt++;
	public void run(){
		try{
			Thread.sleep(1000);
		} catch (Exception e){
			e.printStackTrace();
		}
		System.out.print("#"+threadid+": ");
		doSth();
	}
}