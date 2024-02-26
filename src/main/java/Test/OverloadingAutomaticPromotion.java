package Test;

public class OverloadingAutomaticPromotion {
	
	public void methodOne(int i)
	{
	System.out.println("int-arg method");
	}
	public void methodOne(float f)	//overloaded methods
	{
	System.out.println("float-arg method");
	}
	public void methodOne(String s)
	{
		System.out.println("String version");
	}
	public void methodOne(Object o)	//Both methods are said to
	//be overloaded methods.
	{
	System.out.println("Object version");
	}

	

	
	public static void main(String[] args)
	{
		OverloadingAutomaticPromotion ov = new OverloadingAutomaticPromotion();
		ov.methodOne(10);
		ov.methodOne(10.5f);
		ov.methodOne('a'); //char is promoted to int
		ov.methodOne("arun");
		ov.methodOne(new Object());
		ov.methodOne(null);
	

	 



	}
	


}
