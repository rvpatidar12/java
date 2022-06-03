package InputOutputScannerClass;
import java.util.Scanner;

public class SumOfTwoIntByScanner {
	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number");
		a=sc.nextInt();
	
		System.out.println("Enter second number");
		b=sc.nextInt();
		
		sc.close();
		c=a+b;
		System.out.println("Sum of two entered number is :"+c);
		}
}
