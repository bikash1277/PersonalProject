package PackOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class ShopXtest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
	    for (int t = 0; t < T; t++) {
		int arrSize = input.nextInt();
		int numbers[] = new int[arrSize];
		int oddMidpt = 0;
		int evenMidpt = 0;
		ArrayList<Integer> index = new ArrayList<>();
		ArrayList<Integer> swaps = new ArrayList<>();
		ArrayList<Integer> inputList = new ArrayList<>();
        for (int i = 0; i < arrSize; i++) // used for loop for user input
			{
				numbers[i] = input.nextInt(); // Assigned users value to array
			}
			for (int i = 0; i < numbers.length; i++) {
				inputList.add(numbers[i]);
			}
			if ((inputList.size() % 2) != 0) {
				oddMidpt = (inputList.size() + 1) / 2;
			} else {
				oddMidpt = inputList.size() / 2;
				evenMidpt = (inputList.size()) / 2 + 1;
			}
			Arrays.sort(numbers);
			int largestNum = numbers[numbers.length - 1];
			for (int i = 0; i < inputList.size(); i++) {
				if (inputList.get(i) == largestNum) {
					index.add(i);
				}
			}
			int oddMidptIndex = oddMidpt - 1;
			int evenMidptIndex = evenMidpt - 1;
			if (inputList.size() == 0) {
				swaps.add(0);
			} else {
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
				Collections.sort(swaps);
				System.out.println(swaps.get(0));
			}
		}
	}
}
