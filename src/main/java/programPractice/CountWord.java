package programPractice;

import java.util.Arrays;

public class CountWord {
    public static void main(String[] args) {
        
        String text = "Test test is not test again test.";
        
        long count = Arrays.stream(text.toLowerCase().split("\\W+"))
        		/*
        		 * 
        		 * It’s a regular expression (regex) used in split().

👉 Break it down:
1. \W
In regex, \W means non-word character
It matches anything except:
letters (a-z, A-Z)
digits (0-9)
underscore (_)

✔ Examples of \W:

space " "
comma ,
dot .
exclamation !
@ # $ %
2. +
Means “one or more”
So it matches continuous sequence of non-word characters
3. "\\W+" (double backslash)
In Java strings, \ is an escape character
So you write \\W+ to actually pass \W+ to regex
        		 */
                           .filter(word -> word.equals("test"))
                           .count();

        System.out.println("Count of 'test' is: " + count);
    }
    
}




/*
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {

        String text = "Test the live test live country.";

        Map<String, Long> wordCount = Arrays.stream(text.toLowerCase().split("\\W+"))
                .collect(Collectors.groupingBy(
                        word -> word,
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        System.out.println(wordCount);
    }
}
*/