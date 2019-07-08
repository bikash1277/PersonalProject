package collectionPackage;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCollection {
	public static void main(String[] args) {
	
		TreeSet<String> treeSet=new TreeSet<String>();
		treeSet.add("Bikash");
		treeSet.add("Aditi");
		treeSet.add("Ajay");
		treeSet.add("Shaun");
		treeSet.add("Rakesh");	
		System.out.println(treeSet);
		System.out.println("***************************");
		Iterator<String> itr=treeSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("***************************");
		System.out.println(treeSet.descendingSet());
		System.out.println("***************************");
		Iterator<String> itr2=treeSet.descendingIterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("***************************");
		System.out.println(treeSet.pollFirst());
		System.out.println("***************************");
		System.out.println(treeSet.pollLast());
		System.out.println("***************************");
		
		System.out.println("***************************");
	}
}
