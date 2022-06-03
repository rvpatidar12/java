package CollectionFrameWorkList;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListtt {
	public static void main(String[] args) {
		Deque l = new LinkedList();
		
		l.add(0);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.push(8);
		l.push(9);
		
		//l.pollFirst();
		//l.pollLast();
		System.out.println(l);
		System.out.println(l.peekFirst());
		System.out.println(l.peekLast());
	}


}
