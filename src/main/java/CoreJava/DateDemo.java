package CoreJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d.toString());//standard format
		//for customized format
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(sdf.format(d));
		System.out.println(d.toString());

	}

}
