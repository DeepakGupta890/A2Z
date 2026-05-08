package programPractice;

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Golagola";
		char c='g';
		System.out.println(count(name,c));
		
		

	}

}
