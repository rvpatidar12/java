package Comparator;

import java.util.*;

public class TestMarkSheet {
	public static void main(String[] args) {
		List m = new ArrayList();

		m.add(new MarkSheet("ravi", "Patidar"));
		m.add(new MarkSheet("ravi", "Parmar"));
		m.add(new MarkSheet("vaibhav", "Parmar"));
	
		OrderByName F = new OrderByName();
		Collections.sort(m, F);
		
        for (Object o : m)
        {
			System.out.println(o);
		}
	}
}
