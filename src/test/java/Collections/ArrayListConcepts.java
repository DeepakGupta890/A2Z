package Collections;

import java.util.ArrayList;

public class ArrayListConcepts {
	//Duplicate Objects allowed
	//Insertion Order is Preserved.
	//null Insertion is Possible.
	//Default Initial Capacity 10.
	//New Capacity = (Current Capacity * 3/2)+1
	//ArrayList and Vector Classes Implements RandomAccess Interface. 
	//So that we can Access any Random Element with the Same Speed.
	
	public static void main(String[] args){ 
	
		ArrayList l= new ArrayList();
		
		l.add("A");
		l.add(10); 
		l.add("A");
		l.add(null);
		//l.add(null)   //only one null allowed
		System.out.println(l); //[A, 10, A, null]
		l.removeAll(l);
		System.out.println(l); //[]
		

		
		l.add("N");
		l.add(0, "M"); // shift of element so not good for insertion or deletion 
		l.set(0, 1);
		System.out.println( l.get(1));
		
		System.out.println(l); //[1, N]

		


}
}
