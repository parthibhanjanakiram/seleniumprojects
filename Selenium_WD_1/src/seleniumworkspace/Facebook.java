package seleniumworkspace;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver dr =new ChromeDriver();
		
		dr.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		dr.findElement(By.id("email")).sendKeys("parthibhanwarrior@gmail.com");
		dr.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);	

	}

}
