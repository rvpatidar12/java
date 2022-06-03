package InputOutputStream;

import java.io.File;

public class DisplayFiles {
	public static void main(String[] args) {
		File /* directory */ d=new File("C:\\Users\\DELL\\Documents\\Ajay"); 
		File[] list = d.listFiles();//listFiles() returns the array of files present in the dirctories.
		for(int i=0; i<list.length;i++)
		{
			if(list[i].isFile()) {
				System.out.println((i+1)+":"+list[i].getName());
			}
		}
	}

}
