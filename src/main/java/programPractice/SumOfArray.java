package programPractice;

public class SumOfArray {

	public static void main(String[] args) {
		
		int arr[]= {4,57,1,6,8};
		int sum =0;
		/* for (int ad:arr)
		{
			sum=sum+ad;
		}  */
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum +": Sum of number");

	}

}
