package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Basics3 {
	
	
	
	
	@Test(groups= {"Smoke"})
	public void testcase4()
	{
		System.out.println("testcase4");
	}
	
	@BeforeSuite
	public void testcase12()
	{
		System.out.println("Before SIUTE");
	}
	
	@AfterSuite
	public void testcase13()
	{
		System.out.println("After SIUTE");
	}
	
	
	@Test(dependsOnMethods= {"testcase14","testcase15"})
	public void testcase5()
	{
		System.out.println("testcase5");
	}
	
	
	@Test
	public void testcase14()
	{
		System.out.println("testcase5");
	}
	
	
	
	@Test
	public void testcase15()
	{
		System.out.println("testcase15");
	}
	
	
	@Test(enabled=false)
	public void testcase16()
	{
		System.out.println("testcase16");
	}
	
	

}
