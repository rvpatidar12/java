package Inheritance;

public class TestShape extends Shape {
       public static void main(String[] args) {
		 Shape s[] = new Shape[3];
		 s[0] = new Rectangle();
		 s[1] = new Circle();
		 s[2] = new Triangle();
	}
}
