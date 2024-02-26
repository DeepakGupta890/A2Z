package programPractice;

public class VowelPresence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "Welcome";
		int count=0;
		for (int  i=0;i<str.length();i++)
		{
			if (str.charAt(i)=='a' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' ||str.charAt(i)=='e')
			{
				System.out.println("Vowel is present");
				count++;
				break;
				
				
			}
			else 
			{
				System.out.println("Vovel is not present");
				
			}
			
			
		}
		System.out.println("Total no of vovels :" + count);

	}
	

}
