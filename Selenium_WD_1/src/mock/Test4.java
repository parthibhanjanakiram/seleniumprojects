package mock;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {
	
	@Test
	public void test4() throws EncryptedDocumentException, IOException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		FileInputStream fis = new FileInputStream("./data/testurl.txt");
		Properties prop = new Properties();
		prop.load(fis);
		
		String url= prop.getProperty("url");
		dr.get(url);
		
		dr.findElement(By.xpath(""));
		
		
		
		
		
	}

}
