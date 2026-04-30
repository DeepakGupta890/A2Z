 package programPractice;

public class FindNameChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	String name= "Mr. Deepak Kumar Gupta";
		String[] arr= name.split(" ");
		int len= arr.length;
		for(int i=len-1;i>len-2;i--) //for the last word capture.
		{
			char lastName[] =arr[i].toCharArray();
			for(int j=0;j<lastName.length;j++)
			{
				if(lastName[j]==lastName[2])
				{
					System.out.println(lastName[j]);
				}
			}
			
		} */
		
		 String name = "Mr. Deepak Kumar Gupta";
	        String[] arr = name.split(" ");
	        String lastWord = arr[arr.length - 1]; // Get the last word
	        if (lastWord.length() >= 3) {
	            char result = lastWord.charAt(lastWord.length() - 3);
	            System.out.println("Last word: " + lastWord);
	            System.out.println("3rd char from last : " + result);
	        } else {
	            System.out.println("Last word is too short");
	        }
		

	}

}
