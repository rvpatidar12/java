package Constructor;



public class TestShape extends Shape1 {
	public static void main(String[] args) {

		Shape1 s[] = new Shape1[3];
		s[0] = new Rectangle(10,20);
		s[1] = new Circle(10);
		s[2] = new Triangle(20,30);
		
		for (int i = 0; i < s.length; i++) {
			double d = s[i].area();

			System.out.println(d);
		}
	}

}
