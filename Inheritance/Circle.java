package Inheritance;

public class Circle extends Shape {
    int radius;
    private static Double PI =3.14;
    public Double area() {
    	return PI*radius*radius;
    }
    public int getRadius() {
    	return radius;
    }
    public void setRadius(int r) {
    	radius = r;
    }
}
