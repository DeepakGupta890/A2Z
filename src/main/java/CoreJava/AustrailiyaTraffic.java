 package CoreJava;
import CoreJava.CentralizedTraffic;
public class AustrailiyaTraffic implements CentralizedTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// In interface you can access the implemented method by casting the implementation class.
		//But in Abstraction you can use parent method by casting the child methods because abstraction is perform on child class.
		CentralizedTraffic c=new AustrailiyaTraffic();
		c.greeGo();
		c.redStop();
		c.yellowWait();

	}

	@Override
	public void greeGo() {
		// TODO Auto-generated method stub
		System.out.println("Green go implementation");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("red stop implementation");
		
	}

	@Override
	public void yellowWait() {
		// TODO Auto-generated method stub
		System.out.println("Flash yellow implementation");
	}

}
