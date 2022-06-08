package java8;

public class testAddString {
	public static void main(String[] args) {
		 
		AddString s1 = (a,b) -> {return a+b;};
		String a="Ram";
		String b="Shyam";
		
		System.out.println(a.concat(b));
	}
}
