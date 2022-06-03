package InputOutputPrimitive;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadPrimitiveData {
	public static void main(String[] args) throws Exception {
		FileInputStream f=new FileInputStream("C:\\New folder\\a.dat");
		DataInputStream i=new DataInputStream(f);
		
		System.out.println(i.readInt());
		System.out.println(i.readBoolean());
		System.out.println(i.readChar());
		System.out.println(i.readDouble());
		i.close();
	}

}
