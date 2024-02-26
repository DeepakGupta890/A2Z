package programPractice;

import java.util.Scanner;

public class LargestOf3Number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		
		System.out.println("Enter second number");
		int b=sc.nextInt();
		
		System.out.println("Enter third number");
		int c=sc.nextInt();
		
		//aaApproch 1  logic
		
		/*if (a>b && a>c)
		{
			System.out.println(a +":is largest");
		}
		else if (b>a && b>c) {
			System.out.println(b +":is largest");
		}
		else {
			System.out.println(c +"is largest");
		} */
		
		
		//Ternry operator
		
		//int large= a>b? a:b;
		//int largest=large>c? large:c;
		// in one line expression
		int largest= (a>b?a:b)>c? (a>b?a:b):c;
		System.out.println(largest +":Largest number");

	}

}
