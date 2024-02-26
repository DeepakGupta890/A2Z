package CoreJava;

public class Star {

	public static void main(String[] args) {
		
		int k=1;
		for(int i=0;i<=4;i++)
		{
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(k); // Instead of j a new variable is introduced because j is restricted 1 to 4
				System.out.print("\t"); //to give the space in between the row numbers
				k++; // it increments the value in each cycle also				
			}
		
			System.out.println(""); //to insert value in next line
			
		}
		
		System.out.println(".................................................");
		
		int m=1;
	    for(int i=1;i<5;i++)
	    {
	    	for(int j=1;j<=i;j++)
	    	{
	    		System.out.print(m);
	    		System.out.print("\t");
	    		m++;
	    	}
	    	System.out.println(" ");
	    }
	    
	    System.out.println(".........................................................");
	    
	    
	    for(int i=4;i>=1;i--)
	    {
	    	for(int j=1;j<=i;j++)
	    	{
	    		System.out.print("*");
	    		System.out.print("\t");
	    	}
	    			System.out.println("");
	    }
	    
  System.out.println(".........................................................");
	    
	    
	    for(int i=4;i<=4;i--)
	    {
	    	for(int j=4;j<=i;j--)
	    	{
	    		System.out.print(" *");
	    		System.out.print("\t");
	    	}
	    System.out.println("");


	}
	

}}
    





