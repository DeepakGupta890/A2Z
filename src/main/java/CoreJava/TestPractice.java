package CoreJava;

public class TestPractice {

    int m=100;               //instance variable  
    int n=1000;
    
    void m1()  
    {    
        int n=90;                      //local variable   
        int m;
        
       
        m=60;
        System.out.println(m);
        System.out.println(n);
        System.out.println(this.n);
        
        
     


}


	public static void main(String[] args) {
		
		
		TestPractice t=new TestPractice();
		System.out.println(t.m);
		System.out.println(t.n);
		t.m1();
		
		
	
}
}
