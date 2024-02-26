package CoreJava;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class TestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= new Vector<>();
		list.add(70);
		list.add(10);
		list.add(60);
		list.add(71);
		list.add(51);
		System.out.println("elements\n"+ list);
		System.out.println("size of list:"+ list.size());
		System.out.println("for each");
		for(Integer v: list)
		{
			if(v%2==0)
			{
				System.out.println(v+"is even");
			}
			else
			{
				System.out.println(v+"is odd");
			}
			Iterator ref= list.iterator();
			while(ref.hasNext())
			{
				Integer i=(Integer) ref.next();
				if(i%2==0)
				{
					System.out.println(i+": is even");
				}
				else
				{
					System.out.println(i+": is odd");
				}
			}
			
			
		}
		

	}

}
