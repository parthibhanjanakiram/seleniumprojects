package mock;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	@Test
	public void test3() throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		d.navigate().to("https://www.flipkart.com");
		
		d.findElement(By.xpath("//span[@role='button']")).click();
		d.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 15");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@name='q']/../../..//ul//div/..")).click();
		Thread.sleep(2000);
		
		TakesScreenshot take = (TakesScreenshot)d;
		File rough = take.getScreenshotAs(OutputType.FILE);
		File perm= new File("./screenshots/test3.png");
		FileHandler.copy(rough, perm);
		
	    d.quit();
	}
}
