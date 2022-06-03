package InputOutputScannerClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileByScanner {
	public static void main(String[] args) throws Exception {
		FileReader r=new FileReader("C:\\New folder\\a.txt");
		Scanner sc=new Scanner(r);
		
		while(sc.hasNext())
		{
			System.out.println(sc.nextLine());
		}
		r.close();
	}

}
