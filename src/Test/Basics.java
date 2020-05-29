package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basics {
	
	@Parameters({"URL"})	
	@Test(groups= {"Smoke"})
	public void testcase1(String urlname)
	{
		System.out.println("testcase1");
		System.out.println(urlname);
		
	}
	
	@Test
	public void testcase2()
	{
		System.out.println("testcase2");
	}
	
	

}
