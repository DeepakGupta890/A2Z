package programPractice;

public class CountOccuranceforOneWord {
	
	public static int count(String s, char c)
	{
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
		char c='a';
		System.out.println(count(name,c));
		
		

	}

}
