package E9_7_1;

public class Triangle extends Shape {
    int base;
    int hight;
    public Double area() {
    	return (double) 1/2*(base*hight);
    }
    public int getBase() {
    	return base;
    }
    public void setBase(int b) {
    	base = b;
    }
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
}
