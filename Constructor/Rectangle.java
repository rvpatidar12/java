package Constructor;



public class Rectangle extends Shape1 {
	private int length;
	private int width;
	private Double area;
	
	
	public Double area(){
		return (double)length*width;
	}
	public int getLenth() {
		return length;
	}
	public Rectangle(int L,int w) {
		this.length= L;
		this.width=w;
	}
	public int getWidth() {
		return width;
	}
	public Rectangle() {
	}

}
