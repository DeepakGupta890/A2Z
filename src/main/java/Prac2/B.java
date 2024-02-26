package Prac2;
import Pac1.A;
  class B extends A {
	  protected int getNoOfWheels()
	  {
		  return 5;
	  }
	public static void main(String args[]){  
		   A obj = new B();  
		   obj.msg();  
		   System.out.println(obj.x);
		   System.out.println(obj.getNoOfWheels());
		   
	}
}
