package E9_7_2;

public class Employee extends Address implements Cloneable
{

  public String name =null;
  public Address add=null;

      public Employee () {}
     
      public Employee(String n) {
       this.name=n;
	   add=new Address("ind","uk");
      }
      public String getName() { return name; }
	  
      public void setName(String name) {
	   this.name = name;
	  }
	  public Object clone() throws CloneNotSupportedException{
		Employee e=(Employee) super.clone();
	    e.add=(Address)add.clone();  
		return e;
		
	}
}