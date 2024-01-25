package seleniumworkspace;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args)throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.instagram.com/");
		
		  d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		  d.findElement(By.name("username")).sendKeys("parthi021");
		  d.findElement(By.name("password")).sendKeys("rawlion");
		  d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		 d.findElement(By.cssSelector("div[class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']"
		  )).click(); Thread.sleep(4000);
		 
		  d.findElement(By.xpath("//button[.='Save Info']")).click();
		  d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		  d.findElement(By.xpath("//button[.='Not Now']")).click();
		 
		
		
	}

}
