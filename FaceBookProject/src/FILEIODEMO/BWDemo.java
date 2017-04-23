package FILEIODEMO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BWDemo {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw= new FileWriter("abc.txt");
		
		BufferedWriter bw= new BufferedWriter(fw);
		
		bw.write(100);
		bw.newLine();
		bw.write("srini");
		
		bw.flush();
		bw.close();

	}

}
