package hacker;

import org.junit.Test;

public class StringManipulation {

	@Test
	public void main() {
		String strName="I am Bikash Mishra ";
		System.out.println(strName.length());
		
		System.out.println(strName.charAt(5));
		
		System.out.println(strName.indexOf("i"));
		
		String[] arStr=strName.split(" ");
		String rev="";
		for(int i=arStr.length-1;i>=0;i--) {
			rev=rev+" "+arStr[i];
		}
		System.out.println(rev);
		String str2="I am Indian";
		System.out.println(strName.concat(str2));
		System.out.println(strName+str2);
	}
}
