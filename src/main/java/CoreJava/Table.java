package CoreJava;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner n= new Scanner(System.in);
		System.out.print("Enter the number for which you want table");
		int m=n.nextInt();
		

for(int i=1;i<=10;i++)
{
int	count= m*i;
	System.out.println(m+"*"+i+"=" +count);
}

	}
	
}