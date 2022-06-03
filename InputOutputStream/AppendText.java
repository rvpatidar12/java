package InputOutputStream;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AppendText {
	public static void main(String[] args) throws Exception{
		FileWriter w=new FileWriter(("C:\\Users\\DELL\\Documents\\Ajay\\demoFile.txt"),true);
		//writing "true" after filewriter will add in the existing file whatever we write.

		
		PrintWriter p=new PrintWriter(w);
		//PrintWriter class can be used to write output data in a commonly readable form(text).
		
		for(int i=0; i<5; i++)
		{
			p.println(i+" : Test");//whatever we will write in println it will write that into our file "demoFile.txt".
		}
		 
		p.close(); //close() method of Reader class in java is used to close the stream and release the resources
		w.close(); //that were busy in the stream.
		
		
		System.out.println("Done");
	}

}
