package programPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class CountOccuranceOfWords {
	
	@Test
	public void countWordOccurance()
	{
		   String sent = "Test the live test live country.";

	        // Normalize string
	        sent = sent.toLowerCase().replaceAll("[^a-z ]", "");
	        //replaceAll("[^a-z ]", "") =Keeps only letters + spaces

	        String[] words = sent.split("\\s+");
	        //\\s+ will remove the multiple spaces
	        
	        //\\W+  => its sort and quick but remove special character and punctuation along with space

	        Map<String, Integer> map = new LinkedHashMap<>();

	        for (String word : words) {
	            map.put(word, map.getOrDefault(word, 0) + 1);
	        }

	        // Print result
	        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	        
	      
	}
	
	  
    @Test
    public void countOccuranceNumber()
    {
    	   int[] arr = {3, 5, 6, 4, 3, 5};

           Map<Integer, Integer> map = new HashMap<>();

           for(int num : arr) {
               map.put(num, map.getOrDefault(num, 0) + 1);
           }

           for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
               if(entry.getValue() > 1) {
                   System.out.println(entry.getKey());
               }
           }
    }
	

}
