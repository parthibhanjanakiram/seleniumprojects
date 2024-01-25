package seleniumworkspace;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndLogoutUsingSeleniumMethods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.get("https://github.com/login");
		Thread.sleep(3000);
		d.findElement(By.id("login_field")).sendKeys("parthibhanwarrior@gmail.com");
		d.findElement(By.id("password")).sendKeys("Flash@021");
		d.findElement(By.name("commit")).click();
		Thread.sleep(3000);
		d.findElement(By.cssSelector("img[class='avatar circle']")).click();
		d.findElement(By.cssSelector("a[class='ActionListContent']")).click();
		Thread.sleep(2000);
		d.findElement(By.cssSelector("input[class='btn btn-block f4 py-3 mt-5']")).click();
		
		d.quit();
	}

}
