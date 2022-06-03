package E4_14;

public class E4_14_18 {
	public static void main(String[] args) {
		int a = 100;
		int b[] = {10,9,5,3,2,1};
		secondMethod(a,b);
		
	}
	public static void secondMethod(int a, int b[]) {
		int temp = 0,j=0;
		for(int i=0; i<b.length;i++) {
			if(a == b[i]) {
				j=i;
				temp++;
			}
		}
		if(temp>0) {
			System.out.println(j);
		}
		else {
			System.out.println(-1);
		}
		
	}

}
