package programPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

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
	
	public void removeDuplicateWord()
	{
		
		String sent = "Test the live test live country.";
        sent=sent.toLowerCase().replaceAll("[^a-z ]", "");
        String words[]= sent.split("\\s+");
        
       StringBuilder result= new StringBuilder();
        
        Set<String> set= new LinkedHashSet<>();
        
        for(String word: words)
        {
            if(set.add(word))
            {
                result.append(word).append(" ");
            }
        }
System.out.println(result.toString().trim());
        
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
    
    
    @Test
    public void removceDuplicates1()
    {
    	 int[] arr = {3, 5, 6, 4, 3, 5};
         

         
         StringBuilder result= new StringBuilder();
          
          Set<Integer> set= new LinkedHashSet<>();
          
          for(int value: arr)
          {
              if(set.add(value))
              {
                  result.append(value).append(" ");
              }
          }
  System.out.println(result.toString().trim());
    }
	
    
    @Test
    public void removceDuplicates2()
    {
    	 int[] arr = {3, 5, 6, 4, 3, 5};

         List<Integer> list = new ArrayList<>();

         for(int value : arr) {

             if(!list.contains(value)) {
                 list.add(value);
             }
         }

         System.out.println(list);
    }
    @Test
    public void removceDuplicates3()
    {

        int[] arr = {3, 5, 6, 4, 3, 5};

        List<Integer> result = Arrays.stream(arr)
                                     .distinct()
                                     .boxed()
                                     .collect(Collectors.toList());

        System.out.println(result);
    }
    
    @Test
    public void sequencingValues()
    {
    	int[] arr = {0,0,1,0,1,1,0}; // =>[0, 1, 0, 1, 0, 1, 0]

        for(int i = 0; i < arr.length; i++) {

            if(i % 2 == 0) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    

}
