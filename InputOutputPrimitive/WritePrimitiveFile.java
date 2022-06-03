package InputOutputPrimitive;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class WritePrimitiveFile {
	public static void main(String[] args) throws Exception {
		long DataPosition=0;
		RandomAccessFile i=new RandomAccessFile("a.dat","rw");
		i.writeLong(0);
		i.writeChars("blahblahblah");
		DataPosition = i.getFilePointer();
		i.writeInt(123);
		i.writeBytes("blahblahblah");
		
		i.seek(0);
		i.writeLong(DataPosition);
		i.close();
	}

}
