package E11_8;
import java.util.ArrayList;
import java.util.Iterator;

public class E11_8_1 
{
		public static void main(String[] args) {
			ArrayList L=new ArrayList();
			L.add(20);
			L.add(40);
			L.add(60);
			L.add(80);
			L.add(100);
			
			Iterator i=(Iterator) L.iterator();
			while(i.hasNext())
			{
				System.out.print(i.next()+",");
			}
		}
}
