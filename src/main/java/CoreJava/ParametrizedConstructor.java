package CoreJava;

public class ParametrizedConstructor {
	// The parameterized constructor is used to provide different values to distinct objects. 
	//However, you can provide the same values also.
	 int id;  
	    String name;  
	    //creating a parameterized constructor  
	    ParametrizedConstructor(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    //method to display the values  
	    void display()
	    {System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    //creating objects and passing values  
	    	ParametrizedConstructor s1 = new ParametrizedConstructor(111,"Karan");  
	    	ParametrizedConstructor s2 = new ParametrizedConstructor(222,"Aryan");  
	    //calling method to display the values of object  
	    s1.display();  
	    s2.display();  
	   }  
	

}
