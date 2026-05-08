	package programPractice;

import java.util.Scanner;

public class CountEvenOddNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		
		int even_count=0;
		int odd_count=0;
		
		while(num>0)
		{
			int rem=num%10; //4 3 2  //remainder
		
		if(rem%2==0)
		{
			even_count++;
		
		}
		else
		{
			odd_count++;
		}
		num=num/10;   // bhagphal

	}
		System.out.println("Count of even numbers: " +even_count );
		System.out.println("Count of odd numbers: " +odd_count );

}}


/*import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;

        for (int t = 0; t < k; t++) {
            rotateOne(arr);
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void rotateOne(int[] arr) {
        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
    }
}*/
