package testNG;

import org.testng.annotations.Test;

public class GroupingExecution {
	
	@Test(groups ={"First"})
	public void first()
	{
		System.out.println("parthibhan");
	}
	@Test(groups ={"Second"})
	public void second()
	{
		System.out.println("flash");
	}
	@Test(groups ={"Third"})
	public void third()
	{
		System.out.println("warrrior");
	}

}
