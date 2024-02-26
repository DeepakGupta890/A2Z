package programPractice;

public class PrimeNumber {
	

	public static void main(String[] args) {
		
		
		int m=0;
		int number=15;
		int flag=0;
		m=number/2;
		if(number==0||number==1)
		{
			System.out.println(number + " is not prime number");
		}
		else
		{
			for(int i=2;i<=m;i++)
			{
				if(number%i==0)
				{
					System.out.println(number + " is not prime");
					flag=1;
					break;
				}
				
			}
			if(flag==0)
			{
				System.out.println(number + " is prime");
			}
		}
		

	}

}
