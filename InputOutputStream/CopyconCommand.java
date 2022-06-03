package InputOutputStream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CopyconCommand {
	public static void main(String[] args) throws Exception {
		String t="C:\\Users\\DELL\\Documents\\Ajay\\demoFile.txt";
		FileWriter w=new FileWriter(t);
		PrintWriter p=new PrintWriter(w);
		 
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(r);
		 String l=b.readLine();
		 while(!l.equals("quit")) {
			 p.print(l);
			 l=b.readLine();
			 
		 }
		 p.close();
		 r.close();
		 
		 
	}

}
