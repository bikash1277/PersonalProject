package hacker;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class solutionOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		for (int l = 0; l < T; l++) {
			int size = input.nextInt();
			int[] numbers = new int[size];
			for (int i = 0; i < size; i++) {
				numbers[i] = input.nextInt();
			}
			int max = numbers[0];
			int index = 0;
			for (int i = 0; i < size; i++) {
				if (max < numbers[i]) {
					max = numbers[i];
					index = i;
				}
			}
			int mid = 0;
			if (size % 2 == 0) {
				mid = size / 2;
			} else if (size == 1) {
				mid = 1;
			} else {
				mid = (size + 1) / 2 - 1;
			}
			// System.out.println("Mid is : " + mid);
			if (mid == 1) {
				System.out.println(0);
			} else if (numbers[mid] == max) {
				System.out.println(0);
			} else if (size % 2 == 0 && numbers[mid] != max && numbers[mid - 1] == max) {
				System.out.println(0);
			} else {
				int minSpot;
				for(int i=0;i<size;i++) {
					if(numbers[i]==max) {
						minSpot=Math.abs(i-index);
						if(Math.abs(i-index)<minSpot) {
							minSpot=Math.abs(i-index);
						}
					}
					
				}
				System.out.println(Math.abs(mid - index));
			}
		}
	}
}
