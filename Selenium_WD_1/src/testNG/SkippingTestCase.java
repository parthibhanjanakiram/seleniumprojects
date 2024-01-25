package testNG;

import org.testng.annotations.Test;

public class SkippingTestCase {
	
    @Test(enabled = true)
	public void school()
	{
		System.out.println("checkpoint one");
	}
	
    @Test(dependsOnMethods = "school")
	public void highSchool()
	{
		System.out.println("checkpoint two");
	}
	
    @Test(dependsOnMethods ="highSchool")
	public void college()
	{
		System.out.println("checkpoint three");
	}

}
