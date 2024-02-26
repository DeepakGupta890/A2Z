package CoreJava;

import java.util.Scanner;

public class ArrayHit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String[] sarr= new String[5];
    char[] vowels= {'a','e','i','o','u'};
    System.out.println(vowels.length);


    int arr[]= {25,35,50,17,21};
    for(int i=0;i<=arr.length-1;i++)
     {
	  if(arr[i]%2==0)
	  {
		System.out.println("No is even:"+ arr[i]);
	 }
	else {
		System.out.println("No is odd:"+ arr[i]);
	}
		

}

Scanner s= new Scanner(System.in);
System.out.println("Enter String:");
String str= s.nextLine();
char[] ch= str.toCharArray();
int count =0;
for(char c: ch)
	
{
	if(c=='a'|| c=='e'|| c=='i'||c=='o'||c=='u')
	{
		System.out.println("C test "+ c);
		//c++;
		count++;
}
	}
System.out.println("No of Vowels: "+ count);
//System.out.println("NO of consonent: "+ (ch.length.count));
	}

}
