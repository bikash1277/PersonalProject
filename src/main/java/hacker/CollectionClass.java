package hacker;

import java.util.*;

public class CollectionClass {

	public static void main(String[] args) {

		ArrayList<String> arList=new ArrayList<String>();
		LinkedList<String> llList=new LinkedList<String>();
		arList.add("Bikash");
		arList.add("John");
		arList.add("Shaun");
		arList.add("Aditi");
		arList.add("Rakesh");
		int num=0;
		System.out.println(arList.size());
		while(arList.size()>num) {
			System.out.println(arList.get(num));
			num++;
		}

//Map<Integer, String> map=new HashMap<Integer, String>();
		
	}

}
