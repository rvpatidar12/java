package Constructor;

public class Shape1 {
	
	private String color;
    private int borderWidth;
    
    public Shape1() {
   
    }

    public String getColor() {
	   return color;
    }
    public Shape1(String c){
	   color = c;
    }

    public int getBorderWidth() {
	   return borderWidth;
    }
    public Shape1(int bw) {
	   borderWidth = bw;
    }
	
	public Double area() {
		return null;
	}

}



