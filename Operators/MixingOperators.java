package Operators;

public class MixingOperators {
	public static void main(String[] args) {
		int i=64;
		char c = (char)i;
		System.out.println("c :"+c);
		System.out.println("i :" +i);
		
		double d1,d2;
		int j = 123;
		d1 = j/50;
		d2 = j/50.0;
		System.out.println("d1 :"+d1);
		System.out.println("d2 :"+d2);
	}

}
