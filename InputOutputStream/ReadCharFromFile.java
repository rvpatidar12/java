package InputOutputStream;
import java.io.File;
import java.io.FileReader;

public class ReadCharFromFile {
	public static void main(String[] args) throws Exception
	{
		FileReader f = new FileReader("C:\\Users\\DELL\\Documents\\Ajay\\abc.txt");
		//will use FileReader because it will convert binary or Byte data into a Character data. 
		int i = f.read(); // the read() method of File class is used to read a single character from the stream.
		char c;
		
		while(i != -1)
		{
			c = (char)i;
			System.out.print(c); 
			i = f.read();		
		}
		System.out.println("Done");
	}

}
