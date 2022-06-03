package Constructor;



public class Circle extends Shape1 {
    int radius;
    private static Double PI =3.14;
    public Circle() {
    
    }
    public Double area() {
    	return PI*radius*radius;
    }
    public int getRadius() {
    	return radius;
    }
    public Circle(int r) {
    	radius = r;
    }

}
