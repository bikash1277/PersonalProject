package PackOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class ShopXFinal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();
// for (int n = 0; n < t; n++) {
// int a = sc.nextInt();
// int b = sc.nextInt();
// System.out.println(a + b);

// int t=sc.nextInt();
// int u=sc.nextInt();
// System.out.println(t+u);
		int noOfTC = sc.nextInt();
		int lengthOfArray = sc.nextInt();
		for (int t = 0; t < noOfTC; t++) {
//		System.out.println("number of TCs are : " + noOfTC);
//		System.out.println("length of array is : " + lengthOfArray);
			int array[] = new int[lengthOfArray];
			for (int i = 0; i < lengthOfArray; i++) // used for loop for user input
			{
				array[i] = sc.nextInt(); // Assigned users value to array
			}
// for (int i=0;i<lengthOfArray;i++) // for loop to display values
// {
// System.out.println("Values are :"+array[i]);
// }

			ArrayList<Integer> inputList = new ArrayList<>();
			for (int i = 0; i < array.length; i++) {
				inputList.add(array[i]);
			}
//		System.out.println(inputList);
			int oddMidpt = 0;
			int evenMidpt = 0;
			if ((inputList.size() % 2) != 0) {
				oddMidpt = (inputList.size() + 1) / 2; // 7
			}else {
				oddMidpt = inputList.size() / 2;
				evenMidpt = (inputList.size()) / 2 + 1;
			}
			Arrays.sort(array);
			int largestNum = array[array.length - 1];
//		System.out.println(largestNum);
			ArrayList<Integer> index = new ArrayList<>();
			ArrayList<Integer> swaps = new ArrayList<>();
			for (int i = 0; i < inputList.size(); i++) {
				if (inputList.get(i) == largestNum) {
					index.add(i);
				}
			}
//		System.out.println(index);
			int oddMidptIndex = oddMidpt - 1;
			int evenMidptIndex = evenMidpt - 1;
			if(inputList.size()==0) {
				swaps.add(0);
			}
			else {
			for (int i = 0; i < index.size(); i++) {
				int swapOdd = 0, swapEven = 0;
				if (evenMidpt != 0) {
					swapOdd = Math.abs(index.get(i) - oddMidptIndex);
					swaps.add(swapOdd);
					swapEven = Math.abs(index.get(i) - evenMidptIndex);
					swaps.add(swapEven);
				} else {
					swapOdd = Math.abs(index.get(i) - oddMidptIndex);
					swaps.add(swapOdd);
				}
			}
//		System.out.println(swaps);
			Collections.sort(swaps);
			System.out.println(swaps.get(0));
		}
	}
	}
}
