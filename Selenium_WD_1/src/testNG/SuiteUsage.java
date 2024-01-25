package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteUsage {

	WebDriver dr;
	long startTime;
	long endTime;

	@BeforeSuite
	public void launchBrowser()
	{
		startTime= System.currentTimeMillis();

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
	}
	@Test(priority=0)
	public void google()
	{
		dr.get("https://www.google.com");
	}

	@Test(priority=1)
	public void bing()
	{
		dr.get("https://www.bing.com");
	}

	@Test(priority=2)
	public void yahoo()
	{
		dr.get("https://www.yahoo.com");
	}

	@AfterSuite
	public void closeLaunch()
	{
		dr.quit();
		endTime = System.currentTimeMillis();
		long totalTime = endTime-startTime;
		System.out.println("total time taken:: "+ totalTime);
	}
   

}
