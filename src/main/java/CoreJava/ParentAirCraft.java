package CoreJava;

public abstract class ParentAirCraft {

	public void engine() {
		System.out.println("Follow Engine GuideLines");
	}
	public void SafetyGuideLines()
	{
		System.out.println("Follow Safety GuideLines");
	}
	public abstract void bodyColor();
	
	
//Abstract class may or may not abstract method
	//abstract class can have abstract method, concrete method or both
	//extends keyword is used with the child class in which abstraction needed
	//private modifier and variable is prohibited
	//all modifier is allowed in abstract class accept private modifier
	
}
