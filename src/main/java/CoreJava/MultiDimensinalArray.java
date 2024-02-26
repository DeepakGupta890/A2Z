package CoreJava;

import java.util.Scanner;

public class MultiDimensinalArray {

	public static void main(String[] args) {
		int a[][]=new int [2][3];//[row][column]
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=5;
		a[1][0]=3;
		a[1][1]=4;
		a[1][2]=7;
		System.out.println(a[1][0]);
		
		int b[][]= {{2,4,5},{3,4,7}};
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(a[i][j]);
				
		
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
				System.out.print(c);
				c++;
		}
			}
		int con= ch.length;
		
		System.out.println(" No of Vowels: "+ count);
		System.out.println("NO of consonent: "+ con);
	//	System.out.println("No of vowel:" + );
		
			}
		

	

}
