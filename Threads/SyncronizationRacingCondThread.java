package Threads;

public class SyncronizationRacingCondThread extends Thread{
	
	public static Synchronization data=new Synchronization();
	public SyncronizationRacingCondThread(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			data.deposit(getName(), 1000);
		}
	}
	public static void main(String[] args) {
		SyncronizationRacingCondThread t1=new SyncronizationRacingCondThread("Ram");
		SyncronizationRacingCondThread t2=new SyncronizationRacingCondThread("Shyam");
		t1.start();
		t2.start();
		
	}

}
