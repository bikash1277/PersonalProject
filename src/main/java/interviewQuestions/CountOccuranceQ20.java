package interviewQuestions;

import java.util.HashMap;

public class CountOccuranceQ20 {

	public static void main(String[] args) {
		String inputString="Bikash Mishra";
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		char[] strArray = inputString.toCharArray();

		// checking each char of strArray

		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}
        System.out.println(charCountMap);
		
	}
}
