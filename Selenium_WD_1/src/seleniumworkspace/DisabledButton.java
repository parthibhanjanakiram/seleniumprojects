package seleniumworkspace;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledButton {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver dr =new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		dr.get("https://www.oracle.com/in/database/technologies/oracle-database-software-downloads.html");
		
		JavascriptExecutor js = (JavascriptExecutor) dr;
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,1200)");
		
		dr.findElement(By.xpath("(//a[contains(text(),'ZI')])[2]")).click();
		
		WebElement ele= dr.findElement(By.xpath("//a[contains(.,'Download WINDOWS.X64_193000_db_home.zip')]"));
		
		js.executeScript("arguments[0].click();",ele );
		dr.quit();

	}

}
