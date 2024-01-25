package all_in_one;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

	@Test
	public void test() throws IOException
	{
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		WebElement ele= driver.findElement(By.className("lnXdpd"));

		TakesScreenshot shot = (TakesScreenshot) ele;

		File src= shot.getScreenshotAs(OutputType.FILE);

		File perm= new File("./screenshots/img4.png");

		FileHandler.copy(src, perm);

		driver.quit();

	}
}
