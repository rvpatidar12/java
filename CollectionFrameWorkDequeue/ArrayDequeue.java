package CollectionFrameWorkDequeue;

import java.util.ArrayDeque;

public class ArrayDequeue {


	public static void main(String[] args) {
		
		ArrayDeque d = new ArrayDeque();
		
		d.add(0);
		d.add(1);
		d.add(2);
		d.add(3);
		d.add(4);
		d.add(5);
		d.add(6);
		d.add(7);
		d.push(8);
		d.push(9);
		
		//d.pollFirst();
		//d.pollLast();
		
		System.out.println(d);
		System.out.println(d.peekFirst());
		System.out.println(d.peekLast());
}

}
