package javaInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SecondHighestArr {

	public static void main(String[] args) {
		int[] numArr= {1,12,12,13,15,16,17,20,20};
		int firstHighest;
		Set<Integer> arList=new HashSet<Integer>();
		for(int i=0;i<numArr.length;i++) {
			arList.add(numArr[i]);
		}
		
		System.out.println();
		firstHighest=Collections.max(arList);
		System.out.println(firstHighest);
	}
}
