package CoreJava;

public class ClassCastException {
	
	public static void main(String[] args)
	{
		
		
		Animal a= new Animal(); //valid
		
		Animal cat= new Cat(); //child object to parent type
		Animal dog= new Dog(); //child object to parent type
		
		//Cat cat1= (Cat)new Dog(); 
		// typeCast not work- dog object to cat will not work because both are different type
		
		Cat cat1= (Cat)dog; 
		//because dog reference type is Animal and animal have relation with Cat so casting will work here on compile time.
		//but though an error of ClassCastException at run time because
		
		//Note- Thrown to indicate that the code has attempted to cast 
		//an object to a subclass of which it is not an instance.
		
		 
		
		
		
		
		
	}
	
	
}

class Animal 
{
	//code
}

	
	class Dog extends Animal
	{
		//code
	}
	class Cat extends Animal
	{
		//code
	}
	
	



