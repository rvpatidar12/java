package oop;

public class Rectangle extends Shape {
	private int length;
	private int width;
	private Double area;
	
	public Double area(){
		return (double)length*width;
	}
	public int getLenth() {
		return length;
	}
	public void setLength(int L) {
		length = L;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int w) {
		width = w;
	}
	
}