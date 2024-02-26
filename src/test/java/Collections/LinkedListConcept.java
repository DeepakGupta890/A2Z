package Collections;

import java.util.LinkedList;

public class LinkedListConcept {
	public static void main(String[] args){ 
		
		LinkedList l= new LinkedList();
	
	l.add("Durga");
	l.add(30);
	l.add(null); 
	l.add("Durga");
	l.set(0, "Software");
	l.add(0,"Venky");
	l.add(30);
	l.add("software");
	System.out.println(l); 
	l.removeLast(); 
	l.addFirst("CCC");
	System.out.println(l); 
	
	//[Venky, Software, 30, null, Durga, 30, software]
	//[CCC, Venky, Software, 30, null, Durga, 30, software]



}
}
