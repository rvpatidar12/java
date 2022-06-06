package InputOutputAssignment;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class Assignment1
{
		public static void main(String[] args) throws IOException 
		{
			FileReader r = new FileReader("C://new//a.txt");
			BufferedReader b = new BufferedReader(r);
			FileWriter w = new FileWriter("C://new//b.txt");
            String ch = b.readLine();
            String s = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@" +"(?:[a-zA-Z0-9-]+\\.)+[a-z"
                       +"A-Z]{2,7}$";//EmailRegex
			while (ch != null)
			{
	            System.out.println(ch);
				if (ch.matches(s)) 
				{
					w.write(ch);
					System.out.println(ch);
				}

				ch = b.readLine();
			}

			r.close();
			w.close();
	        b.close();
		}
}



