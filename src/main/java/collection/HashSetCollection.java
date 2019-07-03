package collection;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetCollection {

	public static void main(String[] args) {
		String []strArr= {"John","Shaun","Bikash","Shaun"};
		HashSet<String> hset=new HashSet<>(Arrays.asList(strArr));
		System.out.println("Arrays.asList is : "+Arrays.asList(strArr));
		System.out.println("Hash Set is : "+hset.toString());
		for(String s: hset) {
			System.out.print(s+",");
		}
		System.out.println(hset.toArray());
	}

}
