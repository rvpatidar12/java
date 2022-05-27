package CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class InterfaceList {
	public static void main(String[] args) {
//we can access all the methods of collection interface into the List and its extended classes 
//and also in its implemented interfaces.  
		List L1 = new ArrayList();
		L1.add('r');
		L1.add(0,5);//This add will print 5 at index 0.
		L1.add(1,10);//1st for index value 1.
		L1.add(1,7);
		System.out.println(L1);
		L1.remove(3);// remove method will remove element present at that index position.
		//L1.set(1,3);//it will replace the vlaue at 1st index with 3.
		System.out.println(L1);
		System.out.println(L1.indexOf(3));//we have to use this method in s.o.p. and in bracket 
		                                  //we put value who's index we want to find out.
		System.out.println(L1.lastIndexOf(10));//it give the last index position of value we have given to it.
		System.out.println(L1.subList(1,3));//it will print the values from index we have given to the 
		                                    //second last index value we have given to it.
		
	}

}
