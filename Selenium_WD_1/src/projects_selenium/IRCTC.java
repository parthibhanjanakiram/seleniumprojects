package projects_selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IRCTC {
	
	@Test
	public void log() throws AWTException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver dr = new ChromeDriver();
		/*
		 * ChromeOptions d= new ChromeOptions(); d.addArguments("--disabled--");
		 */
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		dr.get("https://www.irctc.co.in/nget/train-search");
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		dr.quit();
	}

}