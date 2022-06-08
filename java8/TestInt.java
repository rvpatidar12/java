package java8;

public class TestInt
{
	
	public static void main(String[] args)
	{
	MathInt add = (a, b) -> {return a + b;};
	MathInt multiply = (a, b) -> {return a * b;};
	MathInt subtract = (a, b) -> {return a - b;};
	MathInt Division = (a, b) -> {return a/b;};

	int a = 10;
	int b = 5;
	System.out.println("Add " + add.calculate(a, b));
	System.out.println("Multiply " + multiply.calculate(a, b));
	System.out.println("Subtract " + subtract.calculate(a, b));
	System.out.println("Division "+Division.calculate(a, b));
	}
}
