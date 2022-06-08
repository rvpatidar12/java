package E4_14;

public class E4_14_17 {
	public static void main(String[] args) {
		int a[] = {10,9,8,7,6,5};
		int b[] = {10,9,8,7,6};
		secondMethod(a,b);
		
	}
	public static void secondMethod(int a[],int b[]) {
		int c=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a.length>b.length) {
					c = a[i];
					
				}
			}
		}System.out.println(c);
	}

}
