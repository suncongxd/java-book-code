


public class AddAccountSync{
	static Account account=new Account();
	public static void main(String[] args){
		for(int i=0;i<100;i++)
			new Thread(new TaskSync()).start();
		System.out.println("Final balance: "+account.getBalance());
	}
}
class TaskSync implements Runnable{
	public void run(){
		synchronized(AddAccountSync.account){
			AddAccountSync.account.deposit(1);
		}
	}
}