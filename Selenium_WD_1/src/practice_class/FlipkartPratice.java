package practice_class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPratice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		d.get("https://www.flipkart.com/");
		
		d.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		
		d.findElement(By.name("q")).sendKeys("Apple iphone14"+Keys.ENTER);
		
		
		
		List<WebElement> prod = d.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 ')]"));
		List<WebElement> price = d.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14')]/../../div[2]/div[1]/div[1]/div[1]"));
		int count = price.size();
		System.out.println(count);
		
		for (int i = 0; i < count; i++) 
		{
			String productName= prod.get(i).getText();
			
			String priceTag = price.get(i).getText();
			
			System.out.println(productName +"~~~~~~~~~~~>"+ priceTag);
			}
		d.quit();
	}

}
