package CoreJava;

public class Overloading1 {
public void m1(int i)
{
	System.out.println("int-arg method");
}

public void m1(float f)
{
	System.out.println("float-arg method");
}



public static void main(String args[])
{
	Overloading1 l=new Overloading1();
	l.m1(10);
	l.m1(10.5f);

	l.m1(10l);
	

}

}

