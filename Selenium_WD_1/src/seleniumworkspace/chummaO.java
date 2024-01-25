package seleniumworkspace;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chummaO 
{

	@Test
	
	public void demo()
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver dr=new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		dr.get("https://www.youtube.com"); 
		
		WebElement search=dr.findElement(By.name("search_query"));
		
		search.click();
		
		search.sendKeys("One Piece"+Keys.ENTER);
		
		dr.findElement(By.xpath("//yt-formatted-string[contains(.,'One Piece Episode 1091 English Subbed HD1080 ( FIXSUB )')]")).click();
		
		dr.close();                                                    //    //svg[(.=name && class='Attribute value')]
	
	}
}
