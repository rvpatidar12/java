package Threads;

public class PriorityThread extends Thread {
	
	public PriorityThread(String name) {
		super(name);
	}
	public void run() {
		for(int i=0;i<=10;i++) {
			
			System.out.println(getName()+" p = "+getPriority());
		}
	}
	public static void main(String[] args) {
		PriorityThread t1=new PriorityThread("RAVI");
		PriorityThread t2=new PriorityThread("Patidar");
		PriorityThread t3=new PriorityThread("Rays");
		PriorityThread t4=new PriorityThread("Indore");
		
		t1.setPriority(10);
		t2.setPriority(5);
		t3.setPriority(1);
		t4.setPriority(8);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
	}

}
