package Parsing;

public class parseInt {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sum = a+b;
		
		float c = Float.parseFloat(args[2]);
		float c_1 = Float.parseFloat(args[3]);
		float sum_1 = c+c_1;
		System.out.println("sum is "+sum);
		System.out.println(sum_1);
	}

}
