package CoreJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ElementIsPartOfCollectionOrNot {

	public static void main(String[] args) {
		
		List<String> li= new ArrayList<>();
		li.add("Ravi");
		li.add("Rishabh");
		li.add("Rani");
		
		System.out.println(li.contains("Rishabh"));
		System.out.println(li.contains("Reshma"));
		
		System.out.println("=======HashMap===========");
		//With HashMap
		HashMap<String, Integer> hashmap= new HashMap<>();
		hashmap.put("Ravi", 30);
		hashmap.put("Rishabh", 39);
		hashmap.put("Ranu", 45);
		System.out.println(hashmap.containsKey("Ravi"));
		System.out.println(hashmap.containsValue(30));
		System.out.println(hashmap.containsKey("Kalu"));
		System.out.println(hashmap.containsValue(90));
		
		

	}

}
