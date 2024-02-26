package programPractice;

public class StringOccarance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= "Testing";
		int [] count= new int [256];
		for(int i=1;i<=name.length();i++)
		{
			count[name.charAt(i)]++;
      char ch[]= new char[name.charAt(i)];	
		}
	}

}
