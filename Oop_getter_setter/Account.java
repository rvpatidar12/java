package Oop_getter_setter;

public class Account extends Exception{
	private String number;
	private String accountType;
	private double balance;
	private double rB;
	private double wA;
	
	public String getNumber(){
		return number;
	}
	public void setNumber(String n) {
		number = n;
	}
	public String getAccountType(){
		return accountType;
	}
	public void setAccountType(String at){
		accountType = at;
	}
	public void deposit(double d){
		balance = balance+d;
	}
	public void withdrawal(double wA) throws InsufficientException
	{
		
		rB = balance - wA;
		if(rB<500)
		{
			
			System.out.println("Insufficient Balance");
		}
		else
		{
			System.out.println("Transaction succesfully completed...");
			System.out.println("Withdrawal Amount : "+wA);
			System.out.println("Aftet transaction current balance : "+rB);
		}
		
	    
	}
	public double getBalance() {
		return rB;
	}
	public void fundTransfer(double d){
		balance = getBalance()-d;
	}
	public void payBill(double d){
		balance = getBalance()-d;
	}
	
}
