package programPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccuranceOfWords {
	
	public static void main(String[] args)
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

}
