package Selenium;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Practice {
	
	@Test(enabled=false)
	public void isPalindromeNumber()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number");
		int number =sc.nextInt();
		int rev_number=number;
		int rem=0;
		while(number!=0)
		{
			rem=rem*10+number%10;
			number= number/10;
		}
			if(rev_number==rem)
			{
				System.out.println("Entered number is palindrom "+ rev_number );
			}
			else
			{
				System.out.println("Entered number is not palindrom "+ rev_number );
			}
		
	}
	
	
	@Test(enabled=false)
	public void isPalindromeWord()
	{
		String test= "GeeksforGeeks";
		StringBuilder sb= new StringBuilder();
		StringBuilder input =sb.append(test);
		StringBuilder rev_text=input.reverse();
		
		if(test.equals(rev_text))
		{
			System.out.println("is Palindrome");
		}
		else
		{
			System.out.println("is not Palindrome");	
		}
		
		System.out.println("...........................................................");
		
		char[] ch= test.toCharArray();
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

		@Test(enabled=false)
		public void isPrime()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter number");
			int number= sc.nextInt();
			//int m=0;
			int m=number/2;
			int flag=0;
			
			while(number!=0)
			{
				if(number==0 || number==1)
				{
					System.out.println(number +" number is not prime");
				}
				else
				{
					for(int i=2;i<=m;i++)
					{
						if(number%i==0)
						{
							System.out.println(number +" number is not prime");
						}
						flag=1;
						break;
					}
				}
				if(flag==0)
				{
					System.out.println(number +" number is prime");
				}
			}
		}
		
		@Test
		public void isAsendingNumber()
		{
			int arr[] = new int[] {50,32,67,9,13};
			int temp;
			
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]>arr[j])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			System.out.println("Element of sorted array");
			for(int k=0;k<arr.length;k++)
			{
				System.out.print(arr[k] + " ");
			}
		}
	

}
