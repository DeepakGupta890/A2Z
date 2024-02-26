package CoreJava;

public class Static {

	static int x = 20;
	int y = 30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static s = new Static();
		System.out.println(s.x = 100);
		System.out.println(s.y = 50);
		System.out.println("We can call static variable by class name for other claas call if required :" + Static.x);

// x value changes to 100 but y value still 30 for below
		Static s1 = new Static();
		System.out.println(s1.x);
		System.out.println(s1.y);
	}

}
//Ctrl+ Shift+ F---- organize code
//Alt+shift +S-----generate getter setter methods


