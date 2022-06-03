package InputOutputStream;

import java.io.File;

public class DisplayOnlyFiles {
	public static void main(String[] args) {
		
		//This program will print all the file which are present in directory ajay.

		File /* directory */ d = new File("C:\\Users\\DELL\\Documents\\Ajay");
		String []list = d.list(); // list() method returns the array of files and dirctory.
		
		for(int i=0; i<list.length; i++)
		{
			File f=new File("C:\\Users\\DELL\\Documents\\Ajay", list[i]);
			
			if(f.isFile())
			{
				System.out.println((i+1)+ ":"+list[i]);
			}
		}
	}

}
