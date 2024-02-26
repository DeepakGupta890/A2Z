package testNGDemo;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority=2)
	public void m1()
	{
		System.out.println("m1 method executed");
	}
	
	@Test
	public void m2()
	{
		System.out.println("m2 method executed");
	}
	
	@Test(priority=2)
	public void m3()
	{
		System.out.println("m3 method executed");
	}
	
	@Test(priority=1)
	public void m4()
	{
		System.out.println("m4 method executed");
	}
	
	@Test
	public void m5()
	{
		System.out.println("m5 method executed");
	}
	
	@Test(priority=0)
	public void m6()
	{
		System.out.println("m6 method executed");
	}

}
