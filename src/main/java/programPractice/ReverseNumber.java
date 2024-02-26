package programPractice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the number which you want to revert :" );
		int num=sc.nextInt();
		
	//1. Using Algorithm
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+ num%10;  //remender
			num=num/10;   //bhagphal
		
		} 
		
		//2. Using StringBuffer class
		//StringBuffer sb=new StringBuffer(String.valueOf(num));
		//StringBuffer rev= sb.reverse(); 
		
		
		//3. StringBuilder method
		
//		StringBuilder sbl= new StringBuilder();
//		sbl.append(num);
//		StringBuilder rev = sbl.reverse();
     	System.out.println("Reverse number is :"+ rev); 
		System.out.println(5/10);
		
		

	}

}
