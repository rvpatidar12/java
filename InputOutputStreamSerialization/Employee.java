package InputOutputStreamSerialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.zip.InflaterOutputStream;

public class Employee implements Serializable {
	    private int id=0;
	    private String Fname=null;
	    private String Lname;
	    //private Address add;
	    private transient String tempValue;
	    
        public Employee()
        {
        
        }
	    public Employee(int id, String Fname, String Lname)
	    {
	    	this.id = id;
	    	this.Fname = Fname;
	    	this.Lname = Lname;
	    }
        public int getId()
	    {
			return id;
		}
	    public String getFname()
	    {
			return Fname;
		}
	    public String getLname()
	    {
			return Lname;
		}
		public String getempValue()
		{
			return null;
		}
}
