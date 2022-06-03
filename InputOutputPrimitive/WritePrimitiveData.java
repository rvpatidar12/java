package InputOutputPrimitive;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WritePrimitiveData {
	public static void main(String[] args) throws Exception {
		FileOutputStream f=new FileOutputStream("C:\\New folder\\a.dat");
		DataOutputStream o=new DataOutputStream(f);
		o.writeInt(12);
		o.writeBoolean(true);
		o.writeChar('R');
		o.writeDouble(1.2);
		o.close();
		f.close();
		System.out.println("Primitive Data Succesfully Written");
	}

}
