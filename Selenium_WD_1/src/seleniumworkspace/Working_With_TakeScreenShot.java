package seleniumworkspace;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Working_With_TakeScreenShot {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.instagram.com");
		Thread.sleep(3000);
		
		TakesScreenshot pic =(TakesScreenshot) d;
		File draft = pic.getScreenshotAs(OutputType.FILE);
		File main = new File("./screenshots/instagram.png");
		FileHandler.copy(draft, main);
		
		d.quit();
		
	}

}
