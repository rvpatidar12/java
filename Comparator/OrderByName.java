package Comparator;

import java.util.Comparator;

public class OrderByName implements Comparator<MarkSheet> {

	public int compare(MarkSheet m1, MarkSheet m2) {
		if (m1.getFname() != m2.getFname()) {
			return ((String) m1.getFname()).compareTo((String) m2.getFname());
		} 
		else {
		return ((String) m1.getLname()).compareTo((String) m2.getLname());
	}

}
}