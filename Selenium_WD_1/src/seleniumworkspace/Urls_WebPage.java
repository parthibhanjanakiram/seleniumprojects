package seleniumworkspace;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urls_WebPage {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver dr =new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		dr.get("https://www.flipkart.com");
		
		
		dr.findElement(By.xpath("//span[@role='button']")).click();
		Thread.sleep(5000);
		 
		
		List<WebElement> links = dr.findElements(By.tagName("a"));
		Thread.sleep(5000);
		
		
		for(WebElement ele : links) {
			
			System.out.println(ele.getAttribute("href"));
			
		}
		System.out.println(links.size());
		dr.quit();

	}

}
