package seleniumworkspace;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataDrivenTesting {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./data/sample.txt");
		Properties pro = new Properties();
		
		pro.load(fis);
		System.out.println(pro.getProperty("url"));
		System.out.println(pro.getProperty("un"));
		System.out.println(pro.getProperty("pass"));
	}

}
