package CoreJava;
import java.util.ArrayList;
import java.util.LinkedList;

public class CnvrtArrayListToLinkedList {

	public static void main(String[] args) {
		
		ArrayList<String> arrList= new ArrayList<>();
		arrList.add("Ravi");
		arrList.add("Shreya");
		arrList.add("Madhu");
	//ArrayList to LinkedList convert	
		LinkedList <String> linkedList= new LinkedList<>(arrList);
		System.out.println(linkedList);
		
		//LinkedList to ArrayList convert
		ArrayList<String> li= new ArrayList<>(linkedList);
		System.out.println(li);
		

	}

}
