package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGDemo {

	@Test
	public void demo()

	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();

		d.get("https://www.google.com");

		d.quit();
	}

}
