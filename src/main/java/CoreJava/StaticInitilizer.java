package CoreJava;

public class StaticInitilizer {

	
	//static initialization is used to initialize static variables of a class. 
	//The block is called at the time of class initialization. It is called only once.
	
	//If more complicated logic is required for initialization, a static initialization block can be used. 
	//The static initialization blocks are called in the order in which they occur, 
	//and they are called before the constructors.
	
static int i;
    
    static {
        System.out.println("Static Initialization block is called");
        i = 10;
    }
    
    StaticInitilizer() {
        System.out.println("Static Test Constructor is called");
        this.i=20;
    }
    
    public static void main(String[] args)
    {
    	 System.out.println(StaticInitilizer.i); //call static block
    	 StaticInitilizer s1= new StaticInitilizer();//call constructor
    	 System.out.println(s1.i);
    	 
    	 
    	 
}
}
