package selenium_practice_yt;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.leafground.com/alert.xhtml;jsessionid=node06eem39s1vgb31da2lj0lixk35651682.node0");
		
		d.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]")).click();
		
		Alert alert = d.switchTo().alert();
		alert.accept();        //simple alert
		
		d.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]")).click();		
		Alert confirmAlert = d.switchTo().alert();
		Thread.sleep(3000);
		confirmAlert.dismiss();   //confirm alert
		
		d.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]/span[2]")).click();
		d.switchTo().alert().sendKeys("warrior");
		Thread.sleep(3000);
		d.switchTo().alert().accept();
		
		d.quit();

	}

}
