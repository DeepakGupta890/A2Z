package programPractice;

public class EvenOddFromArray {

	public static void main(String[] args) {
		
		int a[]= {2,5,6,8,3};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i] +": is even");
			}
			else
			{
				System.out.println(a[i] + ": is odd");
			}
		}

	}

}
