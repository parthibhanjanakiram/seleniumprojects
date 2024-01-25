package seleniumworkspace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Code {
	

	@Test
	public void demo()
	{
		WebDriverManager.chromedriver().setup();
	    WebDriver dr= new ChromeDriver();
	    dr.manage().window().maximize();
	    
	    dr.get("https://www.facebook.com");
	    dr.findElement(By.id("email")).sendKeys("parthibhan");
	}

}
