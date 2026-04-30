package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMAp {
	
	public static void main(String[] args)
	{
		HashMap<String,String> map= new HashMap<String,String>();
		map.put("username", "Deepak");
		map.put("psw", "Test123");
		System.out.println(map);
		
		System.out.println("..................");
		 for(Map.Entry m : map.entrySet()){    
			    System.out.println(m.getKey()+" "+m.getValue());    
			   }  
			
		
		 
	}

}
