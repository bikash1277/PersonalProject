package javaInterviewQuestions;

public class StringManipulationQ7 {
	
	public static void main(String[] args) {
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
				
		int x=15;
		int y=10;
		System.out.println(x +" "+y);
		//using 3rd Variable
		int temp;
		
//		temp=x;
//		x=y;
//		y=temp;
//		
		System.out.println(x +" "+y);
		//without 3rd variable
		x=x+y; //x=10 y=15
		y=x-y;
		x=x-y;
		
		System.out.println(x+" "+y);

	}
}
