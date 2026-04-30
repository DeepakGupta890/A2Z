package  programPractice;

import java.util.Scanner;

public class CountOccuranceOfAllChar {
	
	public static void main(String[] args) {
//
//	String str= "testighs";
//	int[] count = new int[256];
//	//int len = str.length();
//	for(int i=0;i<str.length();i++) 
//	{
//		//System.out.println("i value : " +str.charAt(i));
//		count[str.charAt(i)]++;
//		char [] ch= new char[str.length()];
//		ch[i]=str.charAt(i);
//		int find=0;
//		for(int j=0;j<=i;j++)
//		{ 
//		
//			if(ch[i]==ch[j])
//			
//				find++;
//						
//		}
//		if (find==1)
//		{
//			System.out.println("The occurance of " + str.charAt(i) +" is :" + count[str.charAt(i)]);
//		}
//	}
		
		
		
		String str = "testighs";

        int[] count = new int[256];

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        // Print only once
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] != 0) {
                System.out.println("Occurrence of " + str.charAt(i) + " is: " + count[str.charAt(i)]);
                
                // Mark as printed
                count[str.charAt(i)] = 0;
            }
        }
	}
	

}
