package E11_8_3;

import java.util.Comparator;

public class OrderByName implements Comparator<Employee> {

	public int compare(Employee m1, Employee m2) {
		if (m1.getFname() != m2.getFname()) {
			return ((String) m1.getFname()).compareTo((String) m2.getFname());
		} 
		else {
		return ((String) m1.getLname()).compareTo((String) m2.getLname());
	}

}
}