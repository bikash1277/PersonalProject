package javaInterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementsQ5 {

	public static void main(String[] args) {
	
		String []arr= {"Bikash","Java","Testing","Bikash","Java"};

//		compare each element
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i].equalsIgnoreCase(arr[j])) {
//					System.out.println(arr[i]);
//				}
//			}
//		}
//		using hashset
//		Set<String> set=new HashSet<String>();
//		for(String a:arr) {
//			if(set.add(a)==false) {
//				System.out.println("Duplicate :"+a);
//			}
//		}
//		
		String s="bbikashMiishhraa";
		char[] ch = s.toCharArray();
		Set<String> setOne=new HashSet<String>();
		List<Integer> listFreq=new ArrayList<Integer>();
		for(Character a:ch) {
			setOne.add(a.toString());
		}
		System.out.println("set of characters is :"+setOne);
		
		String[] strArr = s.split("");
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if ((strArr[i].equals(strArr[j]))&& (i != j)) 
					
					System.out.println("duplicate " + strArr[j]);
			}
			
		}
		HashMap<Character, Integer> hmChar=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			Character c=s.charAt(i);
            if(hmChar.containsKey(c))
            {
            	hmChar.put(  c ,  hmChar.get(c) +1 );
            }
            else
            {
            	hmChar.put( c , 1 ) ;
            }
		}
		System.out.println(hmChar);
		for(int i=0;i<s.length();i++) {
			Character c=s.charAt(i);
			if(hmChar.get(c)==1) {
				System.out.println(c);
				break;
			}
			else{
				System.out.println("not present");
				break;
			}
		}
		
		
	}

}
