package Oop_getter_setter;

public class Account {
	private String number;
	private String accountType;
	private double balance;
	
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
	public void withdrawal(double d){
		balance=getBalance()-d;
	}
	public double getBalance() {
		return balance;
	}
	public void fundTransfer(double d){
		balance = getBalance()-d;
	}
	public void payBill(double d){
		balance = getBalance()-d;
	}
	
}
