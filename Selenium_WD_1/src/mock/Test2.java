package mock;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	@Test
	public void test2() throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		FileInputStream fis = new FileInputStream("./data/testurl.txt");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		
		d.get(url);
		d.findElement(By.xpath("//a[contains(.,'Log in')]")).click();
		
		FileInputStream fis1 = new FileInputStream("./data/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		String val = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String val1 = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		d.findElement(By.id("Email")).sendKeys(val);
		d.findElement(By.id("Password")).sendKeys(val1);
		d.findElement(By.xpath("//input[@value='Log in']")).click();
		
		d.findElement(By.xpath("(//a[contains(.,'Electronics')])[1]")).click();
		d.findElement(By.xpath("(//a[contains(.,'Cell phones')])[4]")).click();
		d.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		d.findElement(By.xpath("//span[contains(.,'Shopping cart')]")).click();
		d.findElement(By.id("termsofservice")).click();
		d.findElement(By.id("checkout")).click();
	    Thread.sleep(2000);
	    
	    TakesScreenshot take= (TakesScreenshot)d;
	    File rough=take.getScreenshotAs(OutputType.FILE);
	    File perm= new File("./screenshots/test2.png");
	    FileHandler.copy(rough, perm);
	    
		d.quit();
		
		
		
		
		
		
		
		
		
		
	}
}
