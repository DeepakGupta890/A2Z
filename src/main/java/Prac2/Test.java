package Prac2;

 class Test implements Interface{
	  
	 public void draw(){System.out.println("drawing rectangle");}  

	 public static void main(String args[]){
		 Interface d=new Test();  
		 d.draw();  
		 System.out.println(Interface.cube(3));  
		 }}  
}
