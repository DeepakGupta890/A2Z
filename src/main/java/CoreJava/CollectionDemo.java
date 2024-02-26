package CoreJava;


import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;


public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> csList= new ArrayList();
		csList.add("Saurabh");
		csList.add("Vineeta");
		csList.add("Deepak");
		int size= csList.size();
		System.out.println("Candidate in cs:"+ size);
		System.out.println(csList);
		Collection<String> ecList= new LinkedList();
		ecList.add("Heera");
		ecList.add("Askar");
		ecList.add("Krishna");
		ecList.add("Pratyush");
		size= ecList.size();
		System.out.println("Candidate in ec:"+ size);
		System.out.println(ecList);
		Collection<String> reqList= new LinkedList<>();
		reqList.addAll(csList);
		reqList.addAll(ecList);
		size= reqList.size();
		System.out.println("Update List:\n"+ reqList);
		System.out.println("size:"+ reqList.size());
		reqList.remove("Askar");
		System.out.println("Update List:"+ reqList);
		System.out.println("size"+ reqList.size());
		reqList.clear();
		return;
		

	}

}
