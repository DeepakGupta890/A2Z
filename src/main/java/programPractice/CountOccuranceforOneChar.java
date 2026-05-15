package programPractice;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class CountOccuranceforOneChar {
	

	
	public static int count(String s, char c)
	{
		s = s.toLowerCase();
	    c = Character.toLowerCase(c);
		int res=0;
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)==c)
				res++;
		}
		return res;
	}
@Test
	public void countOccuranceforChar()
	{
		
		String name="Golagola";
		char c='g';
		System.out.println(count(name,c));
		
	}


//-----------------------------------------

@Test

public void countOccuranceForChar()
{
	  String word="automation";
      char[] ch= word.toCharArray();
      //Stringbuilder result = new StringBuilder();
      Map<Character, Integer> map= new HashMap<>();
      
      for(char c: ch)
      {
          map.put(c, map.getOrDefault(c, 0)+1);
      }
      
      for(Map.Entry<Character, Integer> entry: map.entrySet())
      {
          if(entry.getValue()>1 && entry.getKey()=='t')
          {
              System.out.println(entry.getValue() + "::" + entry.getKey());
          }
      }
}

}
