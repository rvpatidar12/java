package Oop_getter_setter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	private String name = null;
	private Date dob = null;
	SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy"); 
	private String adress = null;
	
	
	public String getName() {
		return name;
	}
	public void setName(String n){
		name = n;
	}
	public String getAdress(){
		return adress;
	}
	public void setAdress(String ad){
		adress = ad;
	}
	
	public String getDob(){
		String s1 = sd.format(dob);
		return s1;
	}
	public void setDob(String d) throws Exception {
		dob = sd.parse(d);
	}
	public Date getAge(){
		return dob;
	}
}
	
    


