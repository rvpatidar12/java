package E11_8_2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList();

		Employee e1 = new Employee("shubham", 50000);
		Employee e2 = new Employee("aniket", 49000);
		Employee e3 = new Employee("utkarsh", 49500);
		Employee e4 = new Employee("ravi", 48000);
		Employee e5 = new Employee("vaibhav", 48500);
		
		Employee e= new Employee();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

		Collections.sort(list, e);
		for (Object o : list) {
			
			
			System.out.println(o);
		}
	}
}

