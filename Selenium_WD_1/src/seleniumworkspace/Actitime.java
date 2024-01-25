package seleniumworkspace;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver d=new ChromeDriver();

		d.get("https://github.com/login");
		d.manage().window().maximize();
		Thread.sleep(3000);
		d.findElement(By.id("login_field")).sendKeys("parthibhanwarrior@gmail.com");
		Thread.sleep(2000);
		d.findElement(By.id("password")).sendKeys("Flash@021");
		Thread.sleep(2000);
		d.findElement(By.name("commit")).click();
		Thread.sleep(2000);
		d.findElement(By.className("avatar circle")).click();
		Thread.sleep(2000);
		d.findElement(By.className("ActionListItem-label")).click();
		Thread.sleep(2000);
		d.quit();
	}

}
