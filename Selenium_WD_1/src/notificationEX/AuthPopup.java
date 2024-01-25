package notificationEX;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopup 
{
	@Test
	public void demo()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		d.quit();
		
	}
	
}
