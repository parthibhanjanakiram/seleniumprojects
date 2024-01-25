package notificationEX;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PromptPop {

	@Test
	public void demo() throws InterruptedException

	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		d.findElement(By.name("promptalertbox1234")).click();
		d.switchTo().alert().sendKeys("yes");
		Thread.sleep(2000);
		d.switchTo().alert().accept();
		Thread.sleep(2000);
		
		d.quit();
		
	}
}
