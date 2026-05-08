package programPractice;

import org.testng.annotations.Test;

public class SearchEleAndPostion {
	
	@Test
	
	public void  searchElementAndPosition()
	{
		 int arr[] ={1,3,3,4,5,6,6,7,8,9,9};
	        
	        int key=6;
	        boolean found= false;
	        int count[]= new int[arr.length];
	        
	        for(int i=0;i<arr.length;i++)
	        {
	            count[arr[i]]++;
	            if(arr[i] ==key)
	            {
	               System.out.println(i); 
	               found= true;
	               
	               
	            }
	            
	        }
	        if(!found==true)
	        {
	            System.out.println("Element not present");
	        }
	}

}
