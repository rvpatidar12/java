package InputOutputStream;

import java.io.File;

public class Directory {
	public static void main(String[] args) {

		// This program will print all the file and subdirectories which are present in
		// directory ajay.

		File /* directory */d = new File("C:\\Users\\DELL\\Documents\\Ajay");// here is the path of dierctory ajay.
		String[] list = d.list();
		
		  for(int i=0; i<list.length; i++) 
		  { 
			  System.out.println((i+1)+ ":"+list[i]);
		  }
		  
		}

}
