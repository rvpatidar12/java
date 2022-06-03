package Constructor;

import oop.Shape;

public class Triangle extends Shape1 {
    int base;
    int hight;
    
    public Triangle() {
    }
    
    public Double area() {
    	return (double) 1/2*(base*hight);
    }
    public int getBase() {
    	return base;
    }
    public Triangle(int b, int hight) {
    	base = b;
    	this.hight= hight;
    }
	public int getHight() {
		return hight;
	}
	
}
