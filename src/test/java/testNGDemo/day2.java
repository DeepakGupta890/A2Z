package testNGDemo;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	
	@Test(groups={"Smoke"})
	public void ploan()
	{
		System.out.println("good");
	}
	
	@BeforeTest
	//Before Test will execute before any test within the package.
	public void prerequiste()
	{
		System.out.println("I will execute first");
	}
}
