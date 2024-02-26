package CoreJava;


public class TestStaticMethod {
	
	public static void main(String args[]){  
		
	   // Student.change();//calling change method  
	    //creating objects  
	    Student s1 = new Student(111,"Karan");  
	    Student s2 = new Student(222,"Aryan");  
	    Student s3 = new Student(333,"Sonoo");  
	    //calling display method  
	    System.out.println(s1);
	    System.out.println(s2);
	    System.out.println(s3);
	    s1.display();  
	    s2.display();  
	    s3.display();  
	    }  
	}  

