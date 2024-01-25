package selenium_practice_yt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSearch {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.co.in");
		d.findElement(By.id("APjFqb")).sendKeys("Abdul kalam"+Keys.ENTER);
		Thread.sleep(3000);
		
		d.quit();

	}

}
