package Selenium;

import java.util.HashMap;
import java.util.Map;

public class HashMapUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> map= new HashMap<>();
		map.put("Arun", 30);
		map.put("Vinod", 20);
		map.put("Rahul", 50);
		
		System.out.println(map);
		for(Map.Entry<String, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey() + " is " + entry.getValue() + " year olds.");
		}
		//  // Retrieve and print a specific person's age
		String findName="vinod";
		if(map.containsKey(findName))
		{
			int age=map.get(findName);
			System.out.println(findName + " is" + age + " years old." );
		}
		else
		{
			System.out.println(findName + " is" + " not in list");		}
		
		 // Remove an entry from the HashMap
        String nameToRemove = "Vinod";
        if (map.containsKey(nameToRemove)) {
            map.remove(nameToRemove);
            System.out.println(nameToRemove + " has been removed from the HashMap.");
        } else {
            System.out.println(nameToRemove + " is not in the HashMap.");
        }
        // Print all entries in the HashMap after removal
        System.out.println("People in the HashMap after removal:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
        }

		

	}

}
