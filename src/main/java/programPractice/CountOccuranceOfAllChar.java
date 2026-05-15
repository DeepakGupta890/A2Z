package  programPractice;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import org.testng.annotations.Test;

public class CountOccuranceOfAllChar {
	
	/*
	 * Convert	               Syntax
 Array → List	            Arrays.asList(arr)
 List → Array	            list.toArray(new Type[0])
 Array → Set	            new HashSet<>(Arrays.asList(arr))
 Set → List	                new ArrayList<>(set)
 List → Set	                new HashSet<>(list)
 Set → Array	            set.toArray(new Type[0])
 Map Keys → List	        new ArrayList<>(map.keySet())
 Map Values → List	        new ArrayList<>(map.values())
	 */


		
		@Test
		
		public void occuranceOfChar()
		{
			
		
		String str = "testighs";

        int[] count = new int[256];

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
            /*
             
str.charAt(i) returns a character
Internally, Java converts it to its ASCII (Unicode) value due to this use 256 instead of str.length() =8

Example:

'a' → 97
't' → 116
             */
       

        // Print only once
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] != 0) {
                System.out.println("Occurrence of " + str.charAt(i) + " is: " + count[str.charAt(i)]);
                
                // Mark as printed
                count[str.charAt(i)] = 0;
            }
        }
	}
		
		
		@Test
	public void removeDuplicateChar1()
	{
			 String input= "automation";
	         
	         char [] ch= input.toCharArray();
	         int [] count= new int[256];
	        
	         StringBuilder result = new StringBuilder();
	         
	         for(char c: ch)
	         {
	             if(count[c]==0)
	             {
	                result.append(String.valueOf(c));
	                 count[c]++;
	             }
	         }
	         System.out.println(result);
	}
		
		@Test
		public void removeDuplicateChar2()
		{
			String input= "automation";
	         
	         char [] ch= input.toCharArray();
	         int [] count= new int[256];
	        
	         StringBuilder result = new StringBuilder();
	         
	         Set <Character> set= new LinkedHashSet<>();
	         for(char c: ch)
	         {
	             if(set.add(c)) {
	                result.append(c);
	            }
	         }
	         
	         System.out.println(result);
		}
	

}
