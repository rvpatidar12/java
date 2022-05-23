package SwappingOfNumbers;

public class SwappingOfNumbers {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;
		System.out.println("Numbers after swapping");
		c=a+b;
		a=c-a;
		b=c-a;
		System.out.println("value of a will be : "+a);
		System.out.println("value of b will be : "+b);
	}

}