package hacker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestSmallest {

	public static void main(String[] args) {
//		smallest and Largest number in Int array		
		int []numbers= {21,11,20,19,78,-10,25,-1,0};
		int largest=numbers[0];
		int smallest=numbers[0];
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			}
			else if (numbers[i]<smallest){
				smallest=numbers[i];
			}
			
		}
		System.out.println(largest +"  "+smallest);
		List list=new ArrayList();
		for(int i=0;i<numbers.length;i++) {
			list.add(numbers[i]);
		}
		System.out.println(list);
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));

	}

}
