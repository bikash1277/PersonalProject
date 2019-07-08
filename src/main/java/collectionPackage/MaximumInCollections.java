package collectionPackage;
import java.util.*;

public class MaximumInCollections {

	public static void main(String[] args) throws Exception{
		int[] arrInt = { 0, 7, 9, 1, 5, 5, 7, 4, 7, 3 };
		List arList=new LinkedList(Arrays.asList(arrInt));
		Set<Integer> arr = new LinkedHashSet<>();
		int pointer = 0;
		int currNumber=Collections.max(arr);
		while (pointer < arrInt.length) {
			currNumber = 5;
			for (int i = 0; i < arrInt.length; i++) {
				if (currNumber == arrInt[i] && i > pointer) {
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