package SwappingOfNumbers;

public class SwappingWithoutThirdVariable {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("values of a and b after swapping will be : ");
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("value of a is : "+a+" and value of b is : "+b);
	}

}
