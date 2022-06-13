package E9_7_1;

public class TestSha extends Shape {
	public static void main(String[] args) {
		Shape s[] = new Shape[3];
		s[0] = new Rectangle();
		s[1] = new Circle();
		s[2] = new Triangle();
		
		
        Rectangle r = (Rectangle) s[0];
        r.setLength(10);
        r.setWidth(20);
		
        Circle c = (Circle) s[1];
		c.setRadius(10);

		Triangle t = (Triangle) s[2];
		t.setBase(20);
		t.setHight(30);

		for (int i = 0; i < s.length; i++) {
			double d = s[i].area();

			System.out.println(d);
		}
	}
}