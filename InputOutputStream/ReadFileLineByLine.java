package InputOutputStream;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFileLineByLine {
	public static void main(String[] args) throws Exception
	{
		FileReader f = new FileReader("C:\\Users\\DELL\\Documents\\Ajay\\demoFile.txt");
		//will use FileReader because it will convert binary or Byte data into a Character data.
		
		BufferedReader br = new BufferedReader(f);
		//will use BufferedReader because it will convert Character data into Line.
		
		String l = br.readLine();
		//readLine() Method of BufferReader Class returns String and when it reaches the end of file it returns null.
		
		while(l != null)
		{
			System.out.println(l);//we are using here "println" and it will give output in a single line.
			l = br.readLine();
		}
	}

}
