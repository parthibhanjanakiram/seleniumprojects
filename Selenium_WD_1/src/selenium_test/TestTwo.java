package selenium_test;

import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestTwo {
	
	public static void main(String[] args) throws Exception 
	{  
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		dr.get("file:///D:/download/MTR.html");
		
		WebElement elem = dr.findElement(By.id("mtr"));
		Select sel= new Select(elem);
		Thread.sleep(2000);
		
		List<WebElement> elements = sel.getOptions();
		int count = elements.size();
		System.out.println(count);
		
		ArrayList<String> arr = new ArrayList<String>();
		
		for(WebElement ele : elements)
		{
			arr.add(ele.getText());
		}
		
//take order from user	
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the item");
		String order=sc.next();
		
		int count1 =0;
		for (String ele2 : arr)
		{ 
			if(ele2.equals(order))
			{
				count1++;
				
			}
		
		}
		if(count1>=1)
		{
			System.out.println("yes,"+count1+"times");
		}
		else 
		{
			System.out.println("no,item is not available");
		}
		
		dr.quit();
		sc.close();
	}		

}
