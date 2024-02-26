package CoreJava;

public class FinallyConcept {
	
	//finally is the block in Java Exception Handling to execute the 
	//important code whether the exception occurs or not.
	
	//Finally block is always related to the try and catch block in exception handling.
	
	//finally block runs the important code even if exception occurs or not.
	
	//Finally block is executed as soon as the try-catch block is executed.
	
	//Finally will execute irrespective to try catch block means 
	//either exception is handled or not but finally block execute
	
	 public static void main(String args[]){   
	      try {    
	        System.out.println("Inside try block");  
	      // below code throws divide by zero exception  
	       int data=25/0;    
	       System.out.println(data);    
	      }   
	      // handles the Arithmetic Exception / Divide by zero exception  
	      catch (ArithmeticException e){  
	        System.out.println("Exception handled");  
	        System.out.println(e);  
	      }   
	      // executes regardless of exception occurred or not   
	      finally {  
	        System.out.println("finally block is always executed");  
	      }    
	      System.out.println("rest of the code...");    
	      }    

}
