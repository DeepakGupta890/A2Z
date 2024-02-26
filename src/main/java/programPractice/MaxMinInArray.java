package programPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MaxMinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,423,6,46,34,23,13,53,4};
		int  max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			else if(arr[i]<min)
			{
				min=arr[i];
			}
			
		}
		System.out.println("Max value :" + max +" and min value :" +min);
		
		//OR
		// Implements inbuilt function  to sort array
		Arrays.sort(arr);
		System.out.println("min - " +arr[0] + " max - " + arr[arr.length-1]);
		//after sorting the value at 0<th> position will be minimum and
		//nth position will be maximum
		System.out.println("...........");
		//convert array to collection list
				//List values= Arrays.asList(arr);
		
		//OR
		
	
		
		//convert array with array stream
		int maxVal=Arrays.stream(arr).max().getAsInt();
		//As we are only working with integers, min doesn’t require a Comparator:
		int minVal= Arrays.stream(arr).min().getAsInt();
		
		System.out.println("min :" +minVal + " max : " + maxVal);

	}

}
