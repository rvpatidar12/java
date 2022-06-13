package E9_7_5;

/*There are some Rules to Make a Class Immutable*/

public final class Employee// 1. The Class is final so we cannot create the subclass.
{
	
	private final String AadharNumber;// 2. instance variable of class is private and final so we cannot change 
	                                 //    the value of it after creating an object.
	
	public Employee(String AadharNo)// 3. There will be constructor not the setter methods so we have no  
	{                               //    option to change the value of the instance variable.
		this.AadharNumber = AadharNo;
	}
	
	public String getAadharNumber()// 4.Define only getter method to fetch the attributes.
	{
		return AadharNumber;
	}
}
