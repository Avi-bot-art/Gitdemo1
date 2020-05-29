package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics2 {
	
	@AfterTest
	public void testcase11()
	{
		System.out.println("after test");
	}
	
	
	
	@Test(groups= {"Smoke"})
	public void testcase3()
	{
		System.out.println("testcase3");
	}
	
	@BeforeTest
	public void testcase10()
	{
		System.out.println("before test");
	}
	
	

}
