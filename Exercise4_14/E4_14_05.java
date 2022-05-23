package Exercise4_14;

public class E4_14_05 {
	public static void main(String[] args) {
		int a = 123, rev=0, rem;
		while(a != 0) {
			rem = a%10;
			rev = rev*10+rem;
			a = a/10;
		}
		System.out.println("Reverse Of a Number a Will Be :- "+rev);
				
	}

}
