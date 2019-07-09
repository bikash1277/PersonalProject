package javaInterviewQuestions;

public class PalindromeQ17 {

	public static String isPalindromeStr(String sNum) {
//		String sNum=String.valueOf(num);
		System.out.println("String is :"+ sNum);
		StringBuilder rNum=new StringBuilder(sNum);
		rNum.reverse();
		System.out.println("Revrese is :"+rNum);
		if(sNum.equalsIgnoreCase(rNum.toString())) {
			return("Palindrome");
		}
		else {
			return("Not Palindrome");
		}
	}
	public static String isPalindromeInt(int num) {
		int r=0;
		int sum=0;
		int t=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		System.out.println("Number is :"+ t);
		System.out.println("Reverse is :"+sum);

		if(t==sum) {
			return "palindrome";	
		}
		else {
			return "Not Palindrome";
		}
	}
	public static void main(String[] args) {
		System.out.println(isPalindromeStr("JOB"));
		System.out.println(isPalindromeInt(121));
	}

}
