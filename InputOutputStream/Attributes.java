package InputOutputStream;

import java.io.File;
import java.util.Date;

public class Attributes
{
	public static void main(String[] args)
	{
		File f = new File("C:\\Users\\DELL\\Documents\\Ajay\\New folder");
		File d = new File("C:\\Users\\DELL\\Documents\\Ajay\\rays");//use for renameTo method.
		if(f.exists())
		{
			System.out.println(f.getName());//it will print the Name of File.
			System.out.println(f.getAbsolutePath());//it will print the full Path of the file.
			System.out.println(f.canWrite());//it will return "True" if we can write to the file.
			System.out.println(f.canRead());//it will return "True" if we read  the file.
			System.out.println(f.isFile());//it will check if its directory or file and return true or false according to it.
			System.out.println(f.isDirectory());//it will check if its directory or file and return true or false according to it.
			System.out.println(new Date(f.lastModified()));//we do not write Date than it will print in milliseconds.
			                                               //and tell us about when this file is last modified.
			System.out.println(f.length());//it will print the length of the file.
	
		}
		//System.out.println(f.delete());//it will delete the folder which is present in the directory but we have to add the folder name 
		           //in the directory path just like this "C:\\Users\\DELL\\Documents\\Ajay\\New folder".
		//System.out.println(f.renameTo(d));//to use this we have to make another object of file destination path and rename it just like this:-
		              //File d = new File("C:\\Users\\DELL\\Documents\\Ajay\\New folder1");
	 
	      //f.list();
		}
}




