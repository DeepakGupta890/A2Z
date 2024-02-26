package Prac2;

public class TestInterfaceStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d=new Rectangle();  
		//Rectangle r=(Rectangle)d;
		d.draw(); 
		
	//r.draw();
		
		System.out.println(Drawable.cube(3));  
		

	}

}
