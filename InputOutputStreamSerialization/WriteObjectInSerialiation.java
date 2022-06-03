package InputOutputStreamSerialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObjectInSerialiation {
	public static void main(String[] args) throws Exception 
	{
		
	   FileOutputStream f=new FileOutputStream("C:\\New folder\\a.ser");
	   ObjectOutputStream o=new ObjectOutputStream(f);
    
	   Employee e=new Employee(12,"Yuvraj","Singh");
    
    
       o.writeObject(e);
       o.close();
    
       System.out.println("Object is succesfully persisted");
	}

}
