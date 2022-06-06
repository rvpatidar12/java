package Threads;

public class Synchronization {
	private int balance=0;
	
	public synchronized void deposit(String msg, int amt) {
		int bal = getBalance() + amt;
		setBalance(bal);
		System.out.println(msg+" new balance "+bal);
	}
	public int getBalance() {
		databaseDelay();
		return balance;
	}
	public void setBalance(int balance) {
		databaseDelay();
		this.balance = balance;
	}
	public void databaseDelay() {
		try {
			Thread.sleep(200);
		}
		catch(InterruptedException e) {
			
		}
	}

}
