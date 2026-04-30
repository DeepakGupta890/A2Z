package CoreJava;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReverseAnArrayList {

	public static void main(String[] args) {
		ArrayList<String> arrlist= new ArrayList<>();
		arrlist.add("Nokia");
		arrlist.add("Samsung");
		arrlist.add("iPhone");
		arrlist.add("One+");
		
		System.out.println("Original ArrayList" + arrlist);
		System.out.println("Reversed ArrayList" + arrlist.reversed());
		
		//or
		Collections.reverse(arrlist); 
		System.out.println("Reveresed ArrayList by collections :" + arrlist);

		
		

	}

}
