package mock;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	@Test
	public void test() throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.get("https://www.vtiger.com/");
		
		Actions act = new Actions(d);
		WebElement ele=d.findElement(By.partialLinkText("Resources"));
		act.moveToElement(ele).perform();
		WebElement ele1=d.findElement(By.partialLinkText("Contact Us"));
		act.moveToElement(ele1).click().perform();
		
		JavascriptExecutor a = (JavascriptExecutor) d;
		Thread.sleep(2000);
		a.executeScript("window.scrollTo(0,300);");
		Thread.sleep(3000);
		
		WebElement ele2 = d.findElement(By.xpath("//p[contains(.,'Bengaluru, India')]/.."));
		File draft = ele2 .getScreenshotAs(OutputType.FILE);
		File main = new File("./screenshots/T1.png");
		FileHandler.copy(draft, main);
	
		d.quit();
		 // JavascriptExecutor js= (JavascriptExecutor) d; js.executeScript(, null)
		 
	}
}
