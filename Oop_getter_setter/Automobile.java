package Oop_getter_setter;

public class Automobile {
	private String color;
	private int speed;
	private String make;
	
	public String getColor(){
		return color;
	}
	public void setColor(String c) {
		color = c;
	}
	public String getMake(){
		return make;
	}
	public void setMake(String rr){
		make = rr;
	}
	public void breck(int b) {
		speed = speed-speed;
	}
	public void changeGear(int cg) {
		
	}
	public void accelerator(int ac) {
		speed = speed+ac;
	}
	public int getSpeed() {
		return speed;
	}
}
	