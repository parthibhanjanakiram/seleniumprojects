package practice_class;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MultiSelect {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver dr =new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		dr.get("file:///D:/download/MultipleSelect.html");
		
		WebElement options= dr.findElement(By.id("cars"));		
		Select sel = new Select(options);
		
	    List<WebElement> ele1 = sel.getOptions();
	    
	    ArrayList<String> a= new ArrayList<String>();
	    
	    for(WebElement element : ele1)
	    {
	    	a.add(element.getText());
	    }
	 
	    Collections.sort(a);
	    System.out.println(a);
	    
	    dr.quit();
	}

}
