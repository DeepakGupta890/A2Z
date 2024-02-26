package programPractice;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= new int[5];
		a[0]=2;
		a[1]=4;
		a[2]=6;
		a[3]=8;
		a[4]=10;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
int b[]= {1,3,5,7,9};
for(int i=0;i<b.length;i++)
{
	System.out.println("..................");
	System.out.println(b[i]);
}
System.out.println("..................");
String s= "soil";

char[] ch= s.toCharArray();

for(char c:ch)
{
	if(c=='a'|| c=='e'|| c=='i'||c=='o'||c=='u')
	{
		System.out.print(c);
	}
}


	

	}
}
	
