package testNG;

import org.testng.annotations.Test;

public class PrioritySample {

	@Test(priority=0,invocationCount = 3)
	public void register()
	{
		System.out.println("reg");
	}
	
	@Test(priority = 1/* ,enabled = false */)
	public void login()
	{
		System.out.println("log");
	}
	
	@Test(priority=2,enabled = true)
	public void delete()
	{
		System.out.println("del");
	}
	
	@Test(dependsOnMethods = "delete")
	public void sucesss()
	{
		System.out.println("sucessfull");
	}
}