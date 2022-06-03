package InputOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CopyABinaryFile {
	public static void main(String[] args) throws Exception {
		String s="C:\\Users\\DELL\\Documents\\Ajay\\rays\\CARDSSSS_4_3.jpg";
		String t="C:\\Users\\DELL\\Documents\\Ajay\\rays\\CARDSSSS_16.jpg";
		
		FileInputStream r=new FileInputStream(s);//FileInputStream class is used to read data from a file in form 
		                                         //of sequence of bytes.
		FileOutputStream w=new FileOutputStream(t);//FileOutputStream class is used to write data (in Bytes) to the files.
		
		int i=r.read();
		while(i != 1)
		{
			w.write(i);
			i=r.read();
		}
		w.close();
		r.close();
		System.out.println(s+"is copied to"+t);
		
	}

}
