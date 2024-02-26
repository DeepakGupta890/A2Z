package CoreJava;

public class Van extends Overloading{
	
	
	 public Van()
	{
		 super();
		System.out.println("Sub class calling");
		
	}

	public void truck(double d)
	{
		System.out.println("d");
		
	}
public void car() {
	System.out.println("lock");
	super.car();
}
}

