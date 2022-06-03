package Oop_getter_setter;
import java.text.ParseException;
public class PersonInformation {
	public static void main(String[] args) throws Exception {
		Person p = new Person();
		p.setName("Ravi");
		p.setAdress("Indore");
		p.setDob("02/09/1996");
		
		Account a = new Account();
		a.setNumber("0123456789");
		a.setAccountType("Savings");
		a.deposit(25000);
		a.withdrawal(24000);
		a.fundTransfer(0);
		a.payBill(0);
		
		Automobile am = new Automobile();
		am.setMake("Rolls Royce");
		am.setColor("white");
		am.changeGear(3);
		am.breck(60);
		am.accelerator(20);
		
		
	    p.getName();
		p.getAdress();
		p.getDob();
		
		a.getNumber();
		a.getAccountType();
	    a.getBalance();
		
		am.getColor();
		am.getMake();
		am.getSpeed();
		
		
		System.out.println("Person's Name :- "+p.getName());
		System.out.println("Adress :- "+p.getAdress());
		System.out.println("Date Of Birth :- "+p.getDob());
		System.out.println();
	
		
		
		System.out.println("Account Number :- "+a.getNumber());
		System.out.println("Account Type :- "+a.getAccountType());
		System.out.println("Remaining Balance :- "+a.getBalance());
		System.out.println();
		
		
		System.out.println("Vehicel Name :- "+am.getMake());
		System.out.println("Vehicel Color :- "+am.getColor());
		System.out.println("Cureent Speed :- "+am.getSpeed());
		}

}
