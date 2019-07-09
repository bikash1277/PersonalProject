package javaInterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;

public class FindMissingInArray {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {2,3,1,0,5};
//		Arrays.sort(arr1);
//		Arrays.sort(arr2);
		for(int i=0;i<arr1.length;i++) {
			int j;
			
			for(j=0;j<arr2.length;j++)
				if(arr1[i]==arr2[j]) 
				break;
			
			if (j == arr1.length) 
                System.out.print(arr1[i] + " "); 
		}
		HashSet<Integer> hsInt=new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++) {
			hsInt.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			if(!hsInt.contains(arr2[i])) {
				System.out.println(arr2[i]);
			}
		}
	}
}
