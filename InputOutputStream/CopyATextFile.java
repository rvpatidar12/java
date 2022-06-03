package InputOutputStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyATextFile {
	public static void main(String[] args) throws Exception
	{
		String s = "C:\\Users\\DELL\\Documents\\Ajay\\demoFile.txt";
		String t = "C:\\Users\\DELL\\Documents\\Ajay\\demoFile1.txt";
		
		FileReader r=new FileReader(s);//FileReader class is used to read a stream of character from the files.
		FileWriter w=new FileWriter(t);//FileWriter class is used to write character oriented data to a file.
		
		int i=r.read();
		while(i != -1)
		{
			w.write(i);
		    i=r.read();
		}
		w.close();
		r.close();
		System.out.println(s+"is copied to"+t);
		
		
	}

}
