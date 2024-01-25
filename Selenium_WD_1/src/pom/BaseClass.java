package pom;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	@BeforeSuite
	public void bs()
	{
		System.out.println("BeforeSuite Started..");
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("BeforeTest Started..");
	}
	
}
