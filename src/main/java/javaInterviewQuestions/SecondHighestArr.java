package javaInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;
import java.util.List;
import java.util.Set;

public class SecondHighestArr {

	public static void main(String[] args) {
		int[] numArr= {1,12,12,13,15,16,17,20,20};
		int firstHighest;
		Set<Integer> arList=new TreeSet<Integer>();
		for(int i=0;i<numArr.length;i++) {
			arList.add(numArr[i]);
		}
		System.out.println();
		firstHighest=Collections.max(arList);
		List<Integer> list=new ArrayList<Integer>(arList);
		System.out.println(list);
		System.out.println(list.get(list.size()-2));
		
		
	}
}
