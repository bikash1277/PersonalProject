package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SecondHighestNumber {

	public static void main(String[] args) {
		int[] numAr={44,77,99,66,99,77,33,22,55};
		Set<Integer> setAr=new TreeSet<Integer>();
		for(int i=0;i<numAr.length;i++) {
			setAr.add(numAr[i]);
		}
		ArrayList<Integer> arSorted= new ArrayList<Integer>(setAr);
		System.out.println(arSorted.get(setAr.size()-2));
		
	}

}
