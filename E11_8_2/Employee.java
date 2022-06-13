package E11_8_2;
import java.util.Comparator;

public class Employee implements Comparator<Employee> 
{

	private String Name;
	private int Salary;
	
	public Employee() {
		
	}

	public Employee(String Name ,int Salary){
			this.Name = Name;
			this.Salary = Salary;
	}

	public String getName() {
		return Name;
	}

	public int getSalary() {
		return this.Salary;
	}

	public int compare(Employee e1, Employee e2) {
		if (e1.getSalary() == e2.getSalary())
			return 0;
		else if (e1.getSalary() > e2.getSalary())
			return 1;
		else
			return -1;
	}
    public String toString() 
    {
		
		return getName()+"  "+getSalary();
	}

}


