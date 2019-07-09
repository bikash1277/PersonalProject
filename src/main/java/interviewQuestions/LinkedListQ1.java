package interviewQuestions;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListQ1 {

	public static void main(String[] args) {
		LinkedList<Integer> lList=new LinkedList<Integer>();
		lList.add(15);
		lList.add(11);
		lList.add(12);
		lList.add(13);
		lList.add(14);
		lList.add(15);
		lList.add(10);
		lList.add(9);
		
		if(lList.size()<2) {
			System.out.println("Middle is: "+lList.get(1));
		}
		else {
			Iterator<Integer> itr= lList.iterator();
			while(itr.hasNext())
			System.out.println();
		}
	}

}
