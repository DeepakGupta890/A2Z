package CoreJava;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input= "tet";
		int len= input.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev= rev+ input.charAt(i);
			
		}
		if (input.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println(" Not Palindrome");
		}
		
		
	}
}
