package E11_8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Date;

public class E11_8_5_1 {
	public static void main(String[] args) {
		int k=1;
		ArrayList a= new ArrayList();
		for(int i=1; i<100000;i++)
		{
			a.add(i);
		}
		Random r= new Random();
		
		for(int j=1;j<=50;j++) {
			int i=r.nextInt(100000);
			System.out.println(k++ +" "+a.get(i));
		}
		HashSet s = new HashSet();
	    System.out.println(s.add(a));
	    
		}
	}


