

class ToJoin extends Thread{
	public ToJoin(String nm){
		super(nm);
	}
	public void run(){
		try{
			Thread.sleep(2000);
		} catch (InterruptedException e){
			System.out.println(this.getName()+" was interrupted. "+
					"isInterrupted(): "+ this.isInterrupted());
			return;
		}
		System.out.println(Thread.currentThread().getName()+" awake!");
	}
}
class Joiner implements Runnable{
	private ToJoin tojoin;
	public Joiner(ToJoin t){
		this.tojoin=t;
	}
	public void run(){
		try{
			this.tojoin.join();
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(this.tojoin.getName()+" join finished");
	}
}
public class TestJoin{
	public static void main(String[] args){
		ToJoin t1=new ToJoin("t1");
		t1.start();
		new Thread(new Joiner(t1)).start();
		
/*		ToJoin t2=new ToJoin("t2");
		t2.start();
		new Thread(new Joiner(t2)).start();
		t2.interrupt();*/
	}
}