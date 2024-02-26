package programPractice;

import java.util.Scanner;

public class PalindromeWord {

	public static void main(String[] args) {
		
		String input = "GeeksforGeeks"; // String does not have reverse method but StringBuilder have
		StringBuilder input1= new StringBuilder();
		
		input1.append(input);
		input1=input1.reverse();
		System.out.println(input1);
		System.out.println("...........................................................");
		char[] ch= input.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
		char m=ch[i];
		String rev=String.valueOf(m);
		System.out.println(rev);
		
		}
		System.out.println("...........................................................");
		 String str, rev = "";
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      str = sc.nextLine();
	 
	      int length = str.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	     
	 
	      if (str.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	 
	   }



	}


