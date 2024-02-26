package CoreJava;

public class StaticConcept2 {
	//1. Instance method of class can access static data member of same class without using class name.
	//2. Instance method of class can access instance dm of same class without using reference var.
	
		 static int a=10;
		 int b=30;
		 
		  void test2 () {
			 System.out.println(a);
			 System.out.println(b);
		 }
		  public static void main(String args[]){
			  StaticConcept2 st= new StaticConcept2();
				 st.test2();
	
	

		  }
}
