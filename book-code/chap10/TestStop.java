

public class TestStop {
	public static void main(String[] args){
		Tick t=new Tick();
		new Thread(t).start();
		try{
			Thread.sleep(3000);
		} catch (Exception e){}
		System.out.println("quiting Task ...");
		t.stopRunning();
	}
}
class Tick implements Runnable {
	private boolean timeToQuit = false;
	public void stopRunning() {
		timeToQuit = true;
	}
	public void run( ){
        while(!timeToQuit){
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
			System.out.println("tick ...");
        }
        System.out.println("Tick finished.");
	}
}