package interviewQuestions;

public class PalindromeQ17 {

	public static void isPalindromeStr(int num) {
		String sNum=String.valueOf(num);
		System.out.println(sNum);
		StringBuilder rNum=new StringBuilder(sNum);
		rNum.reverse();
		System.out.println(rNum);
		if(String.valueOf(num).equals(rNum.toString())) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
	public static String isPalindrome(int num) {
		int r=0;
		int sum=0;
		int t=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(t==sum) {
			return "palindrome";	
		}
		else {
			return "not palindrome";
		}
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome(151));
		isPalindromeStr(123);
	}

}
