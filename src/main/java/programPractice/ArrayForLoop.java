package programPractice;

import java.util.Scanner;

public class ArrayForLoop {
	public static void main(String[] args) { 
		
		Scanner s= new Scanner(System.in);
		
		//The Scanner class in Java is used for taking input from the user.
		//The Scanner class can take input of all the data types.
		//Scanner splits the input after every whitespace.
		//This class is present in java.util package.
		System.out.println("enter size of array");
		
		
		
		int size=s.nextInt(); 
		// The nextInt() method scans the next token of the 
		//input data as an int.
		
		
		
		
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter element at index:"+ i);
			arr[i]=s.nextInt();
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]+ ": is even");
			}
			else
				{
				System.out.println(arr[i]+ ": is odd");
				}
		}
		
		
	
	
	}

}
