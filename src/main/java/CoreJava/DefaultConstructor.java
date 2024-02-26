package CoreJava;

public class DefaultConstructor {
	String test;
//	DefaultConstructor()
//	{System.out.println("Bike is created");
//	
//	}  
	//main method  
	public static void main(String args[]){  
	//calling a default constructor  
		DefaultConstructor b=new DefaultConstructor(); 
		//default constructor is used to provide default values to the object like o, null etc depending upon the type.
		System.out.println(b.test);  //null
		
		System.out.println(b.test="odd"); //odd
		
		
	} 
	// Note- 1.  Constructor indicates JVM about object creation as well as it is responsible for
	//initialization of instance data member for an object.
	//2. Constructor is a special method having same name as that of class and no return type.

}
