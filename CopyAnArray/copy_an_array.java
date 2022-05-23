package CopyAnArray;

public class copy_an_array {
	public static void main(String[] args) {
		char [] c_1 = {'r', 'a', 'v', 'i', 'p', 'a', 't', 'i', 'd','a', 'r'};
		char [] c_2 = new char[7];
		System.arraycopy(c_1, 2, c_2,0,7);
		System.out.println(c_2);
	}

}
