package E10_6_6;

public class TestPropagation {
	
	public static void main(String[] args) throws MistakeException{
		
		try {
			first();
		}
	catch(Exception e2) {
	System.out.println(e2.getMessage());
	}
	}
	private static void first() throws MistakeException{
		
		try {
			second();
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
	private static void second() throws MistakeException{
		MistakeException e = new MistakeException();
		
		throw e;
		
	}
}


