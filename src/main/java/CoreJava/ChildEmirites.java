package CoreJava;

public class ChildEmirites extends ParentAirCraft {
	public static void main(String[] args)
	{
		ChildEmirites c= new ChildEmirites();
		c.bodyColor();
		c.engine();
		c.SafetyGuideLines();

	
	}
	//you can not create object for the abstract class (can't instantiniate)
	//ParentAirCraft p=new ParentAirCraft();

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red Color");
	}
	

}

