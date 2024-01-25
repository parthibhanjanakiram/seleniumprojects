package practice_class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAssignment {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		d.get("https://www.flipkart.com/");

		d.findElement(By.xpath("//span[@class='_30XB9F']")).click();

		d.findElement(By.className("Pke_EE")).sendKeys("watch");
		Thread.sleep(2000);

		List<WebElement> ele = d.findElements(By.xpath("//span[contains(.,'watch')]/.."));
		Thread.sleep(3000);
		
		int count= ele.size();
		System.out.println(count);

		for(WebElement elem : ele)
		{
			System.out.println(elem.getText());
		}
		Thread.sleep(2000);
		d.quit();	
	}

}
