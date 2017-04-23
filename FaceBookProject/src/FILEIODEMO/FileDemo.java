package FILEIODEMO;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		/*File f=new File("abc.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());*/
		
		//Create Folder
		File f1=new File("DEMO");
		//f1.mkdir();
		
		File f2= new File(f1,"text.txt");
		f2.createNewFile();
		
	}

}
