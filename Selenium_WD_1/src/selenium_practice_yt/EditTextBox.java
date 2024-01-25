package selenium_practice_yt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditTextBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();

		dr.get("https://www.leafground.com/input.xhtml");

		WebElement name= dr.findElement(By.name("j_idt88:name"));
		name.sendKeys("Parthibhan");

		WebElement append= dr.findElement(By.xpath("//*[@value='Chennai']"));
		append.sendKeys(" okay");

		WebElement clearText= dr.findElement(By.xpath("//*[@value='Can you clear me, please?']"));
		clearText.clear();


		WebElement getText= dr.findElement(By.name("j_idt88:j_idt97"));
		String text = getText.getAttribute("value");
		System.out.println(text);

		WebElement disabledTextBox= dr.findElement(By.name("j_idt88:j_idt93"));
		boolean value = disabledTextBox.isEnabled();
		System.out.println(value);

// just Press Enter the text field and confirm error message shows or not
// starts
		
		WebElement checkError = dr.findElement(By.name("j_idt106:thisform:age"));
		checkError.click();
		checkError.sendKeys(""+Keys.ENTER);
		
		WebElement error = dr.findElement(By.xpath("//span[.='Age is mandatory']"));
		boolean value2 = error.isDisplayed();
		System.out.println(value2);  
		
//ends

		dr.quit();
	}

}
