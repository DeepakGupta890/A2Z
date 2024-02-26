package CoreJava;


public class MinimumNoOfCurrency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int testAmount=820;
int[] amount=new int[] {500,200,100,50,20,10,5,2,1};
for (int i=0;i<=amount.length-1;i++)
{
	int a=amount[i];
	for(int j=0;j<=amount.length-1;j++)
	{
		int b=amount[j];
		
		if(a*b<=testAmount)
		{
			int c=a*b;
			 testAmount=testAmount-c;
			 
			 
			System.out.println("Currency of " + a+" is : " +b);
			//System.out.println("Remaining amount : "+ testAmount);
			//System.out.print("...........");
			break;
			
			
		}
	}
}

		

}
}
