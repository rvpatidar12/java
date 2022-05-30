package CollectionFrameWork;
import java.util.List;
import java.util.Stack;

public class ListInterfaceStack {
    
	public static void main(String[] args) {

		     Stack l3 = new Stack();
		    
	        l3.push(0);//adding method in stack class in List Interface. 
	        l3.push(1);//adds an element onto the top of the stack.
	        l3.push(2);
	        l3.push(3);
	        l3.push(4);
	        l3.push(5);
	        l3.push(6);
	       
	        System.out.println( l3.pop());//we have to use it inside s.o.p. returns the element from the top
	        System.out.println(l3.pop()); //of the stack, and removes it from stack.
	        
	        System.out.println(l3.peek());//returns the element from top of the stack, and removes it from stack.
	       
			System.out.println(l3);

		}
}





