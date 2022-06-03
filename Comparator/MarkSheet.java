package Comparator;

public class MarkSheet {
	
	
	 private String Fname;
	private String Lname;
	
	
	
	
	public MarkSheet(String fname,String lname) {
		
		
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



