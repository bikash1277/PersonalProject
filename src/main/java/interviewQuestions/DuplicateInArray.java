package interviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {

	public static void main(String[] args) {
		String[] withDuplicates = new String[] {"one","two","three","one","two","two"};

		for(int i=0;i<withDuplicates.length-1;i++) {
			for(int j=i+1;j<withDuplicates.length;j++) {
				if((withDuplicates[i].equals(withDuplicates[j]))&& i != j)
				{
					System.out.println("duplicate is :"+withDuplicates[i]);
				}
			}
		}
		
		Set<String> hsStr=new HashSet<>();
		for(String str: withDuplicates) {
			if(!hsStr.add(str)) {
				System.out.println(str);
			}
		}
	}

}
