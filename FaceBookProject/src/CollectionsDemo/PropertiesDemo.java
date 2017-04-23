package CollectionsDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prod= new Properties();
		
		
	FileInputStream fis= new FileInputStream("C:\\Batch_218\\FaceBookProject\\Config.properties");
	
	prod.load(fis);
		
	System.out.println(prod.getProperty("url"));
	System.out.println(prod.getProperty("browser"));
	System.out.println(prod.getProperty("uname"));
	System.out.println(prod.getProperty("pwd"));
	}

}
