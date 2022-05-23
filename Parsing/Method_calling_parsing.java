 package Parsing;

public class Method_calling_parsing 
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		adding(a,b);
		subtracting(a,b);
		multiplication(a,b);
		division(a,b);
		
    }
	public static void adding(int a, int b)
	{
	  int c = a+b;
	  System.out.println(c);
	}
	public static void subtracting(int a, int b)
	{
	  int c = a-b;;
	  System.out.println(c);
	}
	public static void multiplication(int a, int b)
	{
		int c = a*b;
		System.out.println(c);
	}
	public static void division(int a, int b)
	{
		int c = a/b;
		System.out.println(c);
	}

}
