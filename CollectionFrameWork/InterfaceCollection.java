package CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCollection {
	public static void main(String[] args) {
//we can access all this methods in collection interface and all its implemented interfaces and classes. 
		List L1 = new ArrayList();//List is Interface but ArrayList is Class. 

		L1.add("ravi");
		L1.add('r');
		L1.add(25);
		L1.add(29.2);
		System.out.println(L1);
		
		
		List L2 = new ArrayList();
		L2.add("patidar");
		L2.add(23);
		L2.add(29.2);
		L2.add('k');
		System.out.println(L2);
		
		L1.retainAll(L2);//retainAll method keeps only elements in the original list(L1) that are contained 
		                 //in the specified collection(L2).or we can say it will replace original list with
	    System.out.println(L1);//the specified list.
		
		
		L1.addAll(L2);
		System.out.println(L1);//it will add all element in L1 present in L2. 
		
		L1.remove("ravi");//it will remove element "ravi" from List L1.
	    L2.remove(1);//Remember :- we have to put the index position in remove method not the value itself.
		L1.removeAll(L2);//it will remove all the element of L2 which are also in L1 for example 29.2 will be 
		                //removed from L1 because it is present in L2 also.
		System.out.println(L1);
		
		
		L2.clear();//it will clear all element from L2
		System.out.println(L2);
		
		System.out.println(L1.contains(29.2));//is L1 object contains 29.2 :- it will return "True".
		System.out.println(L1.containsAll(L2));//is L1 contains all element present in L2 - No
		                                       //so it will return "False".
		System.out.println(L1.isEmpty());//is L1 object is empty :- no then it will return "False".
		System.out.println(L1.size());//This method will return the size of object L1.

		for(int i=0; i<L1.size(); i++) { //this for loop print all values of L1 in vertical format.
			System.out.println(L1.get(i));
		}
		
	}
}

