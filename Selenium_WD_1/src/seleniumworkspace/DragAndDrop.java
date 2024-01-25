package seleniumworkspace;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		 ChromeDriver a=new ChromeDriver();
		 a.manage().window().maximize();
		 
		 a.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		 Actions action=new Actions(a);
		 WebElement ele = a.findElement(By.className("draghandle"));
		 WebElement ele2= a.findElement(By.id("column-2"));
		 action.dragAndDrop(ele,ele2).perform();
		 
		 Thread.sleep(4000);
		 a.quit();

	}

}
