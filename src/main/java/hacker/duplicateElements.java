package hacker;

import java.util.HashSet;
import java.util.Set;

public class duplicateElements {

	public static void main(String[] args) {
	
		String []arr= {"Bikash","Java","Testing","Bikash","Java"};

//		compare each element
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equalsIgnoreCase(arr[j])) {
					System.out.println(arr[i]);
				}
			}
		}
//		using hashset
		Set<String> set=new HashSet<String>();
		for(String a:arr) {
			if(set.add(a)==false) {
				System.out.println("Duplicate :"+a);
			}
		}
	}

}
