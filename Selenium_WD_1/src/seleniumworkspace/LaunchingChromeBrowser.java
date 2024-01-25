package seleniumworkspace;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChromeBrowser {

	public static void main(String[] args) 
	{
		// set property
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		// object creation
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();             //maximize the window
        driver.get("https://www.flipkart.com/");         // get url to chrome
        String title=driver.getTitle();                  // get title of the particular application
        System.out.println(title);
        System.out.println(driver.getCurrentUrl());      
        driver.quit();
	}

}
                          