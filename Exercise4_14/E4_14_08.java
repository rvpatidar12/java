package Exercise4_14;

public class E4_14_08 {
	public static void main(String[] args) {
		int a=1;
		for(int i=1; i<=10; i++) {
			System.out.println();
			for(int j=2; j<=10; j++) {
				a=i*j;
				System.out.print(a+"\t");
			}
		}
	}

}
