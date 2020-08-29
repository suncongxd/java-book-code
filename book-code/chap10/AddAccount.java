

public class AddAccount{
	static Account account=new Account();
	public static void main(String[] args){
		for(int i=0;i<100;i++)
			new Thread(new Task()).start();
		System.out.println("Final balance: "+account.getBalance());
	}
}
class Task implements Runnable{
	public void run(){
		AddAccount.account.deposit(1);
	}
}
class Account{
	private int balance=0;
	public void deposit(int amount){
		int tmp=balance+amount;
		Thread.yield();
		balance=tmp;
	}
	public int getBalance(){
		return balance;
	}
}

