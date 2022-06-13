package E13_7;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterReader;
import java.io.IOException;
import java.io.PrintWriter;

public class E13_7_3 
{
//list of file in directory
       public static void main(String[] args) throws IOException {
		File f = new File("D:\\file4.txt");

		String[] f1 = f.list();
		System.out.println("toteleliment");
		for (String o : f1) {
			System.out.println(" \t" + o);
		}
		System.out.println("totel file");

		for (int i = 0; i < f1.length; i++) {

			File f2 = new File("c://New folder", f1[i]);
			if (f2.isFile())

			{
				System.out.println("\t" + f1[i]);
			}
		}

		
		 
		  
		
	//copyfile("C://New folder/a.txt","C://New folder/abc.txt");
	//	split("C://New folder/a.txt");
	
	//margFile("C://New folder/abc.txt","C://New folder/xyz.txt");
	
	}


public static void split(String s) throws IOException {
	int t = 0;
	FileReader r = new FileReader(s);
	int c = r.read();
	while (c != -1) {
		t++;
		char ch = (char) c;
		System.out.print(ch);
		c = r.read();
	}r.close();
	System.out.println("toteleliment" + t);
	
	FileWriter r1 = new FileWriter("D://file1.txt");
	//PrintWriter pw = new PrintWriter(r1);

	FileWriter r2 = new FileWriter("D://file2.txt");
	//PrintWriter pw2 = new PrintWriter(r2);
	FileReader R = new FileReader(s);
	int C = R.read();
	for (int i = 0; i<t; i++) {
		char ch = (char) C;
		if (i < t / 2) {
		r1.write(ch);	//pw.print(ch);
			System.out.print(ch);
				
		} else {
		r2.write(ch);	//pw2.print(ch);
			System.out.print(ch);
		}
		C = R.read();
	}
	System.out.println("\nfile are spited");
	
	R.close();
	r1.close();
	r2.close();

}
public static void copyfile(String s ,String s1) throws IOException {
// copy one file to another file
FileReader r = new FileReader(s);
FileWriter r1 = new FileWriter(s1);
//PrintWriter pw = new PrintWriter(r1);

int c = r.read();

while (c != -1) {
	char ch = (char) c;
	System.out.print(ch);
	r1.write(ch);
	c = r.read();
	
}
System.out.println("\nfile copyed Succes");
r.close();r1.close();

}
public static void margFile(String s1,String s2) throws IOException {
	FileReader r1 = new FileReader(s1);
	
	FileReader r2 = new FileReader(s2);
	int c= r1.read();
	int d=r2.read();
	FileWriter w=new FileWriter("C://New folder/a.txt");
	PrintWriter pw=new PrintWriter(w);
	while(c!=-1) {
		char ch=(char)c;
		pw.print(ch);System.out.print(ch);
		c=r1.read();
	}
	while(d!=-1) {
		char ch=(char)d;
		pw.print(ch);System.out.print(ch);
		d=r2.read();
	}
	System.out.println("\nfile marge succesfuly");
	r1.close();r2.close();pw.close();
}
}




