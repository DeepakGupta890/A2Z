package programPractice;

public class ReverseStringPreserveSpace
{
	 public static void main(String[] args) 
	 {
		  String str = "My name is";
	        System.out.println(reverseWords(str));
	    }

	    public static String reverseWords(String str) 
	    
	    {
	        String[] words = str.split(" ");
	        StringBuilder result = new StringBuilder();

	        for (int i = words.length - 1; i >= 0; i--) 
	        {
	            result.append(words[i]).append(" ");
	        }

	        return result.toString().trim();
	    }
	}


