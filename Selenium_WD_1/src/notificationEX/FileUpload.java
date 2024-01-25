package notificationEX;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	@Test
	public void demo() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		d.get("https://formstone.it/components/upload/demo/");
		Thread.sleep(2000);
		
		JavascriptExecutor js= (JavascriptExecutor)d;
		js.executeScript("window.scrollTo(0,500);");
		
		File pdf = new File("./data/selenium.pdf");
		String path = pdf.getAbsolutePath();
		
		d.findElement(By.xpath("(//input[@type='file'])[3]")).sendKeys(path);
		Thread.sleep(5000);
		
		d.quit();
		
		
	}
}
