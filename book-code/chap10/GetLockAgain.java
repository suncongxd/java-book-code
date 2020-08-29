

public class GetLockAgain implements Runnable{
	public synchronized void mtd(){ 
		System.out.println("Entered Critical Section in mtd()");
		mtd2();
	}
	public synchronized void mtd2(){
		System.out.println("Entered Critical Section in mtd2()");
	}
	
	public void run(){
		mtd();
	}
	public static void main(String[] args){
		new Thread(new GetLockAgain()).start();
	}
}