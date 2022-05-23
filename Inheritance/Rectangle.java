package Inheritance;

public class Rectangle extends Shape {
	private int length;
	private int width;
	
	public Double area(){
		return (double) length*width;
	}
	public void getLenth(int L) {
		length = L;
	}
	public int setLength() {
		return length;
	}

}