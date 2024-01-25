package seleniumworkspace;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Iframe {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		drive.get("file:///D:/download/iframe.html");
		
		drive.switchTo().frame("frame1");
		drive.findElement(By.xpath("(//a[contains(.,'Books')])[1]")).click();
		
	}

}
