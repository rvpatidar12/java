package E13_7;
import java.io.File;
public class E13_7_1 {
	
	public static void main(String[] args) {
				
				//This program will print all the file which are present in directory.

				File directory = new File("C:\\Users");
				String []list = directory.list();
				for(int i=0; i<list.length; i++)
				{
					File f=new File("C:\\Users", list[i]);
					
					if(f.isFile())
					{
						System.out.println((i+1)+ ":"+list[i]);
					}
				}
			

		}

}




