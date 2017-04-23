package OOP1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class test9 {

	public static void main(String[] args) throws IOException {
		
		//properties fiel to your script we need to use
		// properties class
		
		
		
//C:\Batch_218\FaceBookProject\src\OOP1\Config.Properties
		
		FileOutputStream fisout=new FileOutputStream("C:\\Batch_218\\FaceBookProject\\src\\OOP1\\Config.Properties",true);
		FileInputStream fis=new FileInputStream("C:\\Batch_218\\FaceBookProject\\src\\OOP1\\Config.Properties");
		Properties p=new Properties();
	p.load(fis);
	
	//System.out.println(p.getProperty("URL"));
	//System.out.println(p.getProperty("browser"));
	
		fis.close();
		
	
	
	p.setProperty("Zipcode", "522113");
	p.store(fisout, null);
	fisout.close();
	}

}
