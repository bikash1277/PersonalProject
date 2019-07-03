package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class MaximumInCollections {

	public static void main(String[] args) {
		int[] array = { 0, 7, 9, 1, 5, 5, 7, 4, 7, 3 };
		List arList=new LinkedList(Arrays.asList(array));
		Set<Integer> arr = new LinkedHashSet<>();
		int pointer = 0;
		int currNumber=Collections.max(array);
		while (pointer < array.length) {
			currNumber = 5;
			for (int i = 0; i < array.length; i++) {
				if (currNumber == array[i] && i > pointer) {
					System.out.println("Duplicate for " + currNumber + " in " + i);
					arr.add(i);
					break;
				}
			}
			pointer++;
		}
		System.out.println(arr);
	}
}