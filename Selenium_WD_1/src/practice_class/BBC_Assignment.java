package practice_class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBC_Assignment {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver dr =new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		dr.get("https://www.bbc.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) dr;
		WebElement element= dr.findElement(By.xpath("//h2[contains(text(),'Latest Business News')]"));
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		Thread.sleep(3000);
		System.out.println(element.getText());
		
	    List<WebElement> ele= dr.findElements(By.xpath("//h2[contains(.,'Latest Business News')]/../ul/li/a/h3"));
		int count = ele.size();
		System.out.println(count);
		
		for(WebElement elem : ele)
		{
			System.out.println(elem.getText());
		}
		
		dr.quit();  

	}

}
