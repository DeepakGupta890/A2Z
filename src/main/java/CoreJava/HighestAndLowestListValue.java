package CoreJava;

import java.util.Collections;
import java.util.LinkedList;


public class HighestAndLowestListValue {

	public static void main(String[] args) {
		LinkedList<Integer> li= new LinkedList<Integer>();
		li.add(0);
		li.add(1, 34);
		li.add(2,12);
		li.add(3);
		li.add(-3);
	Collections.sort(li);
	System.out.println(li.getFirst());
	System.out.println(li.getLast());

	}

}
