package programPractice;

import java.util.Scanner;

public class CountNumberOfDigit {

	public static void main(String[] args) {

  Scanner sc=new Scanner(System.in);
  System.out.println("Enert Number to count:");
  int num=sc.nextInt();
  int count=0;
   while(num>0)
   {
	   
	   num= num/10;  // bhagfal  (Quotient)
	   
	count++;
   }
   System.out.println("No count is: "+ count);
   System.out.println(123/10);

	}

}
