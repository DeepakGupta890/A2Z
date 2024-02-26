package CoreJava;

public class ConstructorOverloading {
	// A class having multiple constructor  with different parameter list..
	//1. No of parameter.
	//2. Data type of parameter.
	//3. Sequence of parameter.
	
	int pages;
	String size;
	int x;
	ConstructorOverloading()
	{
		 this.x=40;
		this.pages=200;
		this.size= "Medium";
	}
	ConstructorOverloading(int pages, String size)
	{
		this.pages=pages;
		this.size=size;
	}
	 public static void main(String args[]){  
		 ConstructorOverloading co=new ConstructorOverloading();
		 System.out.println(co.pages );
		 System.out.println(co.size);
		 System.out.println(co.x=60);
		 ConstructorOverloading co1=new ConstructorOverloading(400,"Large");
		 System.out.println(co1.pages);
		 System.out.println(co1.size);
	 }

}
