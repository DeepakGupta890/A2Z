package programPractice;

public class ReverseString {

	public static void main(String[] args) {
		String str= "ABCD";
		String rev="";
		
		//approch 1
		int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}  
		
		// Char array method
		
//		 char[] a= str.toCharArray();
//		int len=a.length;
//		for(int i=len-1;i>=0;i--)
//		{
//			rev=rev+a[i];
//			
//		} 
		
		//3. Using String Buffer class
		
//		StringBuffer sb= new StringBuffer(str);
//		System.out.println(sb.reverse());
		System.out.println("Reverse string value: "+ rev);

	}

}
