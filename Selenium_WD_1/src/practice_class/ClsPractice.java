package practice_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClsPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		d.get("https://demowebshop.tricentis.com");
		
		WebElement reg =d.findElement(By.partialLinkText("Register"));
		reg.click();
		
		WebElement gender = d.findElement(By.xpath("//label[.='Male']"));
		gender.click();
		
		WebElement firstName = d.findElement(By.id("FirstName"));
		firstName.click();
		firstName.sendKeys("Parthibhan");
		
		WebElement lastName = d.findElement(By.id("LastName"));
		lastName.click();
		lastName.sendKeys("Warrior");
		
		WebElement email = d.findElement(By.id("Email"));
		email.click();
		email.sendKeys("parthibhanwarrior@gmail.com");
		
		WebElement pwd = d.findElement(By.id("Password"));
		pwd.click();
		pwd.sendKeys("Flash@021");
		
		WebElement conPwd = d.findElement(By.id("ConfirmPassword"));
		conPwd.click();
		conPwd.sendKeys("Flash@021");
		
		WebElement button= d.findElement(By.id("register-button"));
		button.click();
		
		

	}

}
