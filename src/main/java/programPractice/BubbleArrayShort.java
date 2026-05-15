package programPractice;

import java.util.Arrays;

import org.testng.annotations.Test;

public class BubbleArrayShort {

	
		
		
		@Test
		public void test1()
		{
		
		int a[]= {4,2,1,5,3};
		System.out.println("Array before shorting :" + Arrays.toString(a));
		
	
		int n=a.length-1;
		
		for(int i=0;i<n;i++)   //Number of passes- array length -1
		{
			for(int j=0;j<n;j++) //Number of iteration-array length -1
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}	
		System.out.println("Array after shorting :" + Arrays.toString(a));
		}
		
		@Test
		public void test2()
		{
			
		

		
		int[] arr = {7,8,5,0,0,1,2,0};  //o/p --> [0,0,0,1,2,5,7,8]
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp11=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp11;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		}
		
		
		
    @Test
    public void test3()
    {
		int[] arr = {-8,7,3,1,5,-7,-3,-5}; //o/p --> [-8,-7,-3,3,1,5]
		for (int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1] && arr[j+1]<0)
				{
					int tempd=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tempd;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	
		
		
    }
    
    
    @Test
    
    public void test4()
    {
    	
	
		/// shift all 0s to the beginning
		 int[] arr = {7, 8, 5, 0, 0, 1, 2, 0};  // Output --> [0, 0, 0, 7, 8, 5, 1, 2]
		 
		
		 int temp=Integer.MIN_VALUE;
	        
	        for(int i=0;i<arr.length;i++)
	        {
	            for(int j=arr.length-1; j>0; j--)
	            {
	                if(arr[j]==0 && arr[j-1]!=0)
	                {
	                    
	                    temp=arr[j];
	                    arr[j]=arr[j-1];
	                    arr[j-1]=temp;
	                }
	            }
	        }
	     System.out.println(Arrays.toString(arr));   
	       

	        int[] result = new int[arr.length];
	        int zeroCount = 0;

	        // Count 0s and place them in the front
	        for (int value : arr) {
	            if (value == 0) {
	                result[zeroCount++] = 0;
	            }
	        }

	        // Fill in the rest of the numbers
	        for (int value : arr) {
	            if (value != 0) {
	                result[zeroCount++] = value;
	            }
	        }

	        System.out.println(Arrays.toString(result));
		
		
    }
    
    @Test
    
    public void test5()
    {
    	   int[] arr = {0,0,0,1,0,1,0,1};  //=> [0, 0, 0, 0, 0, 1, 1, 1]
           
           int temp;
           for(int i=0; i<arr.length-1;i++)
           {
               for(int j=0;j<arr.length-1;j++)
               {
                   if(arr[j]>0 && arr[j+1]!=1)
                   {
                      temp= arr[j];
                      arr[j]=arr[j+1];
                      arr[j+1]=temp;
                   }
               }
             
                   
           }
           
           System.out.println(Arrays.toString(arr));
    }
		
		
@Test

public void test6()
{
	  int[] arr = {0,0,0,1,0,1,0,1};  //=> [0, 0, 0, 0, 0, 1, 1, 1]
      
      int count=0;
      
      for(int value: arr)
      {
          if(value==0)
          {
              count++;
          }
        
      }
      
      for(int i=0;i<arr.length;i++)
      {
          if(i<count)
          {
              arr[i]=0;
          }
          else
          {
              arr[i]=1;
          }
      }
      
      System.out.println(Arrays.toString(arr));
      System.out.println(count);
}


}
