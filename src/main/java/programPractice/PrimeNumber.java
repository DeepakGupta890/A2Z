package programPractice;

public class PrimeNumber {
	

	public static void main(String[] args) {
		
		

		int number=17;
		
	 boolean isPrime = true;
	
		if(number<=1)
		{
			 isPrime = false;
		}
		else
		{
			 for(int i=2;i<=Math.sqrt(number);i++)
			{
				if(number%i==0)
				{
					isPrime = false;
					break;
				}
				
			}
			 System.out.println(isPrime ? "Prime Number" : "Not Prime Number"); //ternary operator
			 /*if (isPrime) {
    System.out.println("Prime Number");
} else {
    System.out.println("Not Prime Number");
}*/
		}
		

	}

}
