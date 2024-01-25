package selenium_practice_yt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class OpenEdge {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.edge.driver","E:\\edge driver\\msedgedriver.exe");
		WebDriver ch= new EdgeDriver();
		ch.manage().window().maximize();
		ch.get("https://www.youtube.com/?gl=IN");

	}

}
