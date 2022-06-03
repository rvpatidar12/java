package CollectionFrameWorkMap;
import java.util.Map;
import java.util.Properties;

public class MapProperties {
	public static void main(String[] args) {

		Map p = new Properties();

		p.put(1, "rays");
		p.put(2, "ray");
		p.put(3, "ras");
		p.put(4, "rys");
		p.put(5, "ays");
		p.put(6, "rs");
		p.put(7, "ra");

		// h.clear(); //all clear
		// System.out.println(h.entrySet()); //pair form array to curly bracket
		// System.out.println(h.containsKey(6)); //contains the key
		// System.out.println(h.containsValue("ra"));// contains the value
		// System.out.println(h.get(2)); //prints the key value at 2

		// System.out.println(h.isEmpty()); // check whether empty or not

		// System.out.println(h.keySet()); // total key sets

		// System.out.println(h.remove(3)); // remove the value of the key

		// System.out.println(h.size()); // total size
		// System.out.println(h.values()); // print only value

		System.out.println(p);

	}

}



