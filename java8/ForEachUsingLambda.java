package java8;

import java.util.ArrayList;
import java.util.List;

public class ForEachUsingLambda {
	public static void main(String[] args) {
		List<String> li=new ArrayList<String>();
		li.add("Ravi");
		li.add("Vaibhav");
		li.add("Shubham");
		li.add("Aniket");
		li.add("Utakrsh");
		
		li.forEach((n) -> System.out.println(n));
	}

}
