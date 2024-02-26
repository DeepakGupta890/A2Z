package CoreJava;

public class FinalConcept {
	
	//Definition-final is the keyword and access modifier which is used to apply 
	//restrictions on a class, method or variable
	
	//Final keyword is used with the classes, methods and variables.
	
	//functionality
	//(1) Once declared, final variable becomes constant and cannot be modified.
	//(2) final method cannot be overridden by sub class.
	//(3) final class cannot be inherited.
	
	//Final method is executed only when we call it.
	//declaring final variable  
      final int age = 18;  
      
    void display() {  
      
    // reassigning value to age variable gives compile time error  
   // age = 55;  
    }  
      
    public static void main(String[] args) {  
      
    	FinalConcept obj = new FinalConcept();  
    // gives compile time error  
     
   final  int y=20;
   // y=30;
    System.out.println("y value: " +y);
    System.out.println(obj.age); 
    }  
	
		
	}


