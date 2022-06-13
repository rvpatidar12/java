package E11_8_3;

import java.util.*;

public class TestMarkSheet {
	public static void main(String[] args) {
		List m = new ArrayList();

		m.add(new Employee("ravi", "Patidar"));
		m.add(new Employee("ravi", "Parmar"));
		m.add(new Employee("vaibhav", "Parmar"));
	
		OrderByName F = new OrderByName();
		Collections.sort(m, F);
		
        for (Object o : m)
        {
			System.out.println(o);
		}
	}
}
