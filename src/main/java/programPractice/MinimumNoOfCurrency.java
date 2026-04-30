package programPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class MinimumNoOfCurrency {
	
	public static void main(String[] args)
	  {
	    
	    int amount=880;
	    int notes[]={500, 200,100,50, 10};
	    
	    Map<Integer, Integer> result= new LinkedHashMap<>();
	    //“LinkedHashMap is used to maintain the insertion order of currency notes while storing the result.”
	    
	    for(int note: notes)
	    {
	        if(note<=amount)
	        {
	           int count= amount/note;
	           result.put(note, count);
	            amount=amount%note;
	        }
	    }
	    
	    for(Map.Entry<Integer, Integer> entry : result.entrySet())
	    {
	        System.out.println("note :" + entry.getKey() + "Count  " + entry.getValue());
	    }
	        
	    } 

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	
//		int testAmount=820;
//int[] amount=new int[] {500,200,100,50,20,10,5,2,1};
//for (int i=0;i<=amount.length-1;i++)
//{
//	int a=amount[i];
//	for(int j=0;j<=amount.length-1;j++)
//	{
//		int b=amount[j];
//		
//		if(a*b<=testAmount)
//		{
//			int c=a*b;
//			 testAmount=testAmount-c;
//			 
//			 
//			System.out.println("Currency of " + a+" is : " +b);
//			//System.out.println("Remaining amount : "+ testAmount);
//			//System.out.print("...........");
//			break;
//			
//			
//		}
//	}
//}
//
//		
//
//}
}
