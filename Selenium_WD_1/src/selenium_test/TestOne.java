package selenium_test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TestOne {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("https://www.google.com/");
		
		dr.findElement(By.id("APjFqb")).sendKeys("Wipro jobs" + Keys.ENTER);
		Thread.sleep(4000);
		
		TakesScreenshot shots = (TakesScreenshot) dr;
		File draft = shots.getScreenshotAs(OutputType.FILE);
		File main = new File("./screenshots/wiprojobs.png");
		FileHandler.copy(draft, main);
		
		dr.quit();

	}

}
