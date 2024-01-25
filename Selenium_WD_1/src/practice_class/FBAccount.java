package practice_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBAccount {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		d.get("https://www.facebook.com/");
		
		WebElement account = d.findElement(By.partialLinkText("Create new account"));
		account.click();
		
		WebElement firstName= d.findElement(By.name("firstname"));
		firstName.click();
		firstName.sendKeys("warrior");
		
		WebElement surName= d.findElement(By.name("lastname"));
		surName.click();
		surName.sendKeys("field021");
		
		WebElement email = d.findElement(By.name("reg_email__"));
		email.sendKeys("parthibhan@gmail.com"+Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement reEmail = d.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[4]"));
		reEmail.sendKeys("parthibhan@gmail.com");
		
		WebElement pwd= d.findElement(By.name("reg_passwd__"));
		pwd.sendKeys("Flashwarrior@021");
		
		WebElement day= d.findElement(By.id("day"));
		Select sel= new Select(day);
		sel.selectByValue("21");
		
		WebElement month= d.findElement(By.id("month"));
		Select sel2= new Select(month);
		sel2.selectByVisibleText("Nov");
		
		WebElement year= d.findElement(By.id("year"));
		Select sel3= new Select(year);
		sel3.selectByValue("2000");
		
		WebElement gender= d.findElement(By.xpath("(//input[@name='sex'])[2]"));
		gender.click();
		
/*		WebElement button= d.findElement(By.name("websubmit"));
		button.click();    */
		
		d.quit();		
		
	}

}
