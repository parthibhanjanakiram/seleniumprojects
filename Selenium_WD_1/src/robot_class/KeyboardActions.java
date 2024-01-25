package robot_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {
	
	@Test
	public void demo() throws AWTException
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.get("https://www.google.com/");
		d.findElement(By.id("APjFqb")).click();
		
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_P);
		
		d.quit();
		
	}

}
