package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParametersEx {
	
	@Test
	@Parameters("Name")
	public void com(String name)
	{
		System.out.println("name is:"+ name);
	}

}
