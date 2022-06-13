package E14_10;

public class Printer extends Storage {
	public void run() {
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);

		}

	}

	public static void main(String[] args) {
		Printer t1 = new Printer();

		t1.start();
	}

}



