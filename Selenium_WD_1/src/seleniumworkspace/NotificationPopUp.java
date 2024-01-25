package seleniumworkspace;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class NotificationPopUp {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeOptions setting=new ChromeOptions();
		setting.addArguments("--disable-notifications");
		setting.addArguments("--incognito") ;
		WebDriver drive = new ChromeDriver(setting);
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		
		
		drive.get("https://www.facebook.com/");
		
		TakesScreenshot shot = (TakesScreenshot) drive;
		File src = shot.getScreenshotAs(OutputType.FILE);
		File perm = new File("./screenshots/img2.png");
		FileHandler.copy(src, perm);
		
		drive.quit();		
	}

}
