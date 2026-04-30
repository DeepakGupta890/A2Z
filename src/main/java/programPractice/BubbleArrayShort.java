package programPractice;

import java.util.Arrays;

public class BubbleArrayShort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		int[] ar2 = {7,8,5,0,0,1,2,0};  //o/p --> [0,0,0,1,2,5,7,8]
		for(int i=0;i<ar2.length-1;i++)
		{
			for(int j=0;j<ar2.length-1;j++)
			{
				if(ar2[j]>ar2[j+1])
				{
					int temp11=ar2[j];
					ar2[j]=ar2[j+1];
					ar2[j+1]=temp11;
				}
			}
		}
		System.out.println(Arrays.toString(ar2));
		
		
		
	//.....................................................
		int[] tr1 = {-8,7,3,1,5,-7,-3,-5}; //o/p --> [-8,-7,-3,3,1,5]
		for (int i=0;i<tr1.length-1;i++)
		{
			for(int j=0;j<tr1.length-1;j++)
			{
				if(tr1[j]>tr1[j+1] && tr1[j+1]<0)
				{
					int tempd=tr1[j];
					tr1[j]=tr1[j+1];
					tr1[j+1]=tempd;
				}
			}
		}
		System.out.println(Arrays.toString(tr1));
	
		
		
		
		///
		/// shift all 0s to the beginning
		 int[] ar3 = {7, 8, 5, 0, 0, 1, 2, 0};  // Output --> [0, 0, 0, 7, 8, 5, 1, 2]
		 
		
		 int temp=Integer.MIN_VALUE;
	        
	        for(int i=0;i<ar3.length;i++)
	        {
	            for(int j=ar3.length-1; j>0; j--)
	            {
	                if(ar3[j]==0 && ar3[j-1]!=0)
	                {
	                    
	                    temp=ar3[j];
	                    ar3[j]=ar3[j-1];
	                    ar3[j-1]=temp;
	                }
	            }
	        }
	     System.out.println(Arrays.toString(ar3));   
	       

	        int[] result = new int[ar3.length];
	        int zeroCount = 0;

	        // Count 0s and place them in the front
	        for (int value : ar3) {
	            if (value == 0) {
	                result[zeroCount++] = 0;
	            }
	        }

	        // Fill in the rest of the numbers
	        for (int value : ar3) {
	            if (value != 0) {
	                result[zeroCount++] = value;
	            }
	        }

	        System.out.println(Arrays.toString(result));
		
		
		
		
		

	}

}
