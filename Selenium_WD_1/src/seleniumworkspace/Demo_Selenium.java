package seleniumworkspace;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_Selenium {

	public static void main(String[] args)throws Exception {
		
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		 ChromeDriver a=new ChromeDriver();
		 a.manage().window().maximize();
		 
		 a.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		 a.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		 
		 WebElement ele= a.findElement(By.xpath("//select"));
		 Select sel = new Select(ele);
		 
/*		 sel.selectByVisibleText("Congo");
		 Thread.sleep(3000); */
		 
		 sel.selectByValue("IND");
		 Thread.sleep(3000);
		 
		 a.quit();
	}

}
