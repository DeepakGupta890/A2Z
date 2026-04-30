package programPractice;

public class MinValueInArray {
	
	//Find min value in array
	static void min(int arr[]){  
		int min=arr[0];  
		for(int i=1;i<arr.length;i++) 
			
		 if(min>arr[i]) 
		 {
			 
		 
		  min=arr[i];  
		  
		
		} 
		System.out.println(min);  
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={33,15,13,4,5};//declaring and initializing an array  
		min(a);//passing array to method  
		

		
	}
}
	
	
	/*public class MinNumber {
	    public static void main(String[] args) {

	        int[] arr = {10, 5, 20, 3, 15};

	        int min = Integer.MAX_VALUE;

	        for (int num : arr) {
	            if (num < min) {
	                min = num;
	            }
	        }

	        System.out.println("Minimum number is: " + min);
	    }
	}
	
	
	

}  */
	
	
	/*import java.util.Arrays;

	public class MinNumber {
	    public static void main(String[] args) {

	        int[] arr = {10, 5, 20, 3, 15};

	        int min = Arrays.stream(arr).min().getAsInt();

	        System.out.println("Minimum number is: " + min);
	    }
	}
*/
	
	
	/*import java.util.Arrays;
import java.util.List;
import java.util.Collections;

	public class MinNumber {
	    public static void main(String[] args) {

	        List<Integer> list = Arrays.asList(10, 5, 20, 3, 15);

	        int min = Collections.min(list);

	        System.out.println("Minimum number is: " + min);
	    }
	} */