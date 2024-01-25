package select_class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelect {

	@Test
	public void demo() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		d.navigate().to("https://demoqa.com/select-menu");
		JavascriptExecutor js= (JavascriptExecutor)d;
		Thread.sleep(2000);
	    js.executeScript("window.scrollTo(0,400);");
	    
		WebElement ele=d.findElement(By.id("cars"));
		Select sel = new Select(ele);
		Thread.sleep(2000);
		
		List<WebElement> list = sel.getOptions();
		int count = list.size();
		System.out.println(count);
		
		sel.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		d.quit();
	}
}
