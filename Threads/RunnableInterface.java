package Threads;

public class RunnableInterface implements Runnable{

	@Override
	public void run()
	{
	     System.out.println("Hello From Thread !");
	}
	
	public static void main(String[] args)
	{
		RunnableInterface rT=new RunnableInterface();
		Thread t=new Thread(rT);
		t.start();
	}

}
