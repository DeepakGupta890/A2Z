package CoreJava;



public class Variable {
	int z;
	//System.out.println(z);  
	int x=10;    // Instant variable
	void fun()
	{
		int x=15;
		int y=30;     //Local variable
		int b=12;
		System.out.println(x);     //instant variable can be called in any method
		System.out.println(y); 
		System.out.println(b); 
		System.out.println(this.x); //Local variable and instant variable can have same name
	}
	
	void show()
	{
		System.out.println(x);     //instant variable can be called in any method
		//System.out.println(y);     // local variable can't be called in other method(shows compile error)
		int b=13;
		System.out.println(b);     // Local variables can have same name.
		
	}

public static void main(String[] args) {
	Variable v= new Variable();
	v.fun();
	v.show();
	

	}

}
