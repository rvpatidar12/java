package InputOutputStreamSerialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObjectInSerialization 
{
	public static void main(String[] args) throws Exception 
	{
		
	   FileInputStream f=new FileInputStream("C:\\New folder\\a.ser");
	   ObjectInputStream i=new ObjectInputStream(f);
    
	   Employee e=(Employee)i.readObject();
	   
	   System.out.println(e.getId());
	   System.out.println(e.getFname());
	   System.out.println(e.getLname());
	   System.out.println(e.getempValue());
	   
    
       System.out.println("Object is succesfully persisted");
	}

}


