package producerconsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountProducerConsumer{
	static Account account=new Account();
	public static void main(String[] args){
		ExecutorService exec=Executors.newFixedThreadPool(2);
		exec.execute(new DepositTask());
		exec.execute(new WithdrawTask());
		exec.shutdown();
	}
}
class Account{
	private int balance=0;
	public synchronized void deposit(int amount){
		this.notifyAll();
		balance+=amount;
		System.out.println("Deposit "+amount+"; balance = "+getBalance());
	}
	public synchronized void withdraw(int amount){
		while(balance<amount){
			try{
				this.wait();
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}
		balance-=amount;
		System.out.println("Withdraw "+amount+"; balance ="+getBalance());
	}
	public int getBalance(){
		return balance;
	}
}
class DepositTask implements Runnable{
	public void run(){
		while(true){
			AccountProducerConsumer.account.deposit(1);
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e){ 
				e.printStackTrace(); 
			}
		}
	}
}
class WithdrawTask implements Runnable{
	public void run(){
		while(true){
			AccountProducerConsumer.account.withdraw(5);
		}
	}
}
