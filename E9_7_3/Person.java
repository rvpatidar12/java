package E9_7_3;

public class Person {
	private String Fname = null;
	private String Lname = null;
	
	public Person(String Fname, String Lname) //constructor
	{
		this.Fname=Fname;
		this.Lname=Lname;
	}
	
	public String toString() //overriden toString method (its method of Object class), if we do not use this method
	{                        //then it will print hashcode values of the objects
	    return Fname+" "+Lname;
	}
	 
	public static void main(String[] args)
	{
		Person p=new Person("Ravi","Patidar");
		Person p1=new Person("Ritesh","Patidar");
		Person p2=new Person("Arvind","Patidar");
		System.out.println(p);
		System.out.println(p1);
		System.out.println(p2);
	}

}
