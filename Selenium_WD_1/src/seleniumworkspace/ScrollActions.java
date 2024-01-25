package seleniumworkspace;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrollActions {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.manage().window().maximize();
	//	drive.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		drive.get("https://www.oracle.com/in");
		
		JavascriptExecutor act = (JavascriptExecutor) drive;
		Thread.sleep(2000);
		act.executeScript("window.scrollTo(0,1500);");
		Thread.sleep(3000);
		
		drive.quit();

	}

}
