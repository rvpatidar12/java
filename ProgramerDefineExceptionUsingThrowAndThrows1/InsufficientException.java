package ProgramerDefineExceptionUsingThrowAndThrows;

public class InsufficientException extends Exception
{
	
	
	private double balance=0;
	private double rB;
	
	
	public void deposit(double d)
	{
		setBalance(getBalance()+d); 
	} 
	
    public void withdrawal(double wA) throws InsufficientException
    {
    	rB=getBalance();
		try {
		if (rB-wA < 500)
		{
			
			System.out.println("Insufficient Balance");
			System.out.println("Remaining Balance " + balance);
		}
		else
		{
			setBalance (getBalance() - wA);
			System.out.println("Transaction succesfully completed...");
			System.out.println("Withdrawal Amount : " + wA);
			System.out.println("After transaction current balance : " + getBalance());
		}
		}catch(Exception e) {
			System.out.println("caught : "+e.getMessage());
			System.out.println("current balance is : "+balance);
		}

	}
	
   public void setBalance(double d) {
		this.balance=d;
		
	}
	
    public double getBalance()
    {
		return balance;
	}
}
	

