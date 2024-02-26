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

	}

}
