package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AnagramQ21 {

	public static void main(String[] args) {
		String str1 = "LISTENS";
		String str2 = "SILENTS";
		char[] str1Ar = str1.toCharArray();
		char[] str2Ar = str2.toCharArray();
		if (str1Ar.length != str2Ar.length) {
			System.out.println("length is not matching...");
		} else {
			Arrays.sort(str1Ar);
			Arrays.sort(str2Ar);
			for (int i = 0; i < str1Ar.length; i++)

				if (str1Ar[i] != str2Ar[i])
					System.out.println("Not Anagram");
			System.out.println("Anagram");
		}
//String of numver to integer
		String sNum = "1234";
		System.out.println(Integer.parseInt(sNum) - 10);
//finding first non repeative character in a String
		String str = "iikashMishra";
		List<Character> list = new ArrayList<Character>();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if (!list.contains(c)) {
				System.out.println(list);
				list.remove((Character) c);
				list.add(c);
//				System.out.println(list);
				} else { 
					list.add(c); 
					} 
			} 
		System.out.println(list.get(0));
		
	}
}