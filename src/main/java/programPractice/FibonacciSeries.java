package programPractice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter size of array");
		int n=sc.nextInt();
		
		int firstNumber=0;
		int secondNumber=1;
		int nextTerm;
		 System.out.println("Fibonacci Series till " +n + " terms:");
		System.out.print(firstNumber + ",");
		System.out.print(secondNumber+ ",");
		for(int i=1;i<=n;i++)
		{
			nextTerm=firstNumber+secondNumber;
			System.out.print(nextTerm + "," );
			firstNumber=secondNumber;
			secondNumber=nextTerm;
			
		}

	}

}
