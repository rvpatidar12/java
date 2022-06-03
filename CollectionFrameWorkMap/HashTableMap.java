package CollectionFrameWorkMap;

import java.util.Hashtable;
import java.util.Map;

public class HashTableMap {

public static void main(String[] args) {
	
	Map m = new Hashtable();
	
	m.put(1, "rays");
	m.put(2, "ray");
	m.put(3, "ras");
	m.put(4, "rys");
	m.put(5, "ays");
	m.put(6, "rs");
	m.put(7, "ra");
	
	
	// h.clear(); //all clear
			// System.out.println(h.entrySet()); //pair form array to curly bracket
			// System.out.println(h.containsKey(6)); //contains the key
			// System.out.println(h.containsValue("ra"));// contains the value
			// System.out.println(h.get(2)); //prints the key value at 2

			// System.out.println(h.isEmpty()); // check whether empty or not

			// System.out.println(h.keySet()); // total key sets

			//System.out.println(h.remove(3)); // remove the value of the key
			
			//System.out.println(h.size()); // total size 
			//System.out.println(h.values()); // print only value
			
			
			System.out.println(m);
   }

}
