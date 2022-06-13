package E11_8_3;

public class Employee {
	
	
	 private String Fname;
	private String Lname;
	
	
	
	
	public Employee(String fname,String lname) {
		
		
		this.Fname = fname;
		this.Lname = lname;
				
	}
	
	public Object getFname() {
		return Fname;
	}
	public Object getLname() {
		return Lname;
	}


	public String toString() {
		
		return Fname + Lname;
	}
	
}



