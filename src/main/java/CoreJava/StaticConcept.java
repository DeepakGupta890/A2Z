package CoreJava;

public class StaticConcept {
	//1.  If a method in class wants to access static dm of same class then it should be declared as static.
	//and we can call method directly
	// 2. static method in a class can't access non static dm, it will show CE.
	static int x=10;
	int y=30;
	 static void test ()
	{
		int z=40;
		//System.out.println(x);
		System.out.println(z);
		//System.out.println(y);
	}
	
	
		  public static void main(String args[]){
			  
			test();
			
			 
		  }

		  

}
