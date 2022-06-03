package InputOutputPrimitive;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;

public class ReadPrimitiveFile {

	public static void main(String[] args) throws Exception {
		long dataPosition =0;
		int data = 0;
		RandomAccessFile r=new RandomAccessFile("a.dat","r");
		dataPosition = r.readLong();
		System.out.println("dataPosition :"+dataPosition);
		r.seek(dataPosition);
		data=r.readInt();
		r.close();
		System.out.println("the data is:"+data);
	}

}
