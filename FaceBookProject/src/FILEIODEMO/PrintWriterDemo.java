package FILEIODEMO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {
	
		
		PrintWriter pw= new PrintWriter("abc.txt");
		pw.print("srini");
		pw.print(100);
		pw.print(100.25);
		pw.print("muvva");
		pw.flush();
		pw.close();
	}

}
