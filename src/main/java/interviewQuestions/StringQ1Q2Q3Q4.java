package interviewQuestions;

public class StringQ1Q2Q3Q4 {

	public static void main(String[] args) {
		// Reverse of String using for loop
		String s1 = "Bikash";
		String revS1 = "";
		System.out.println(s1);
		for (int i = s1.length() - 1; i >= 0; i--) {
			revS1 = revS1 + s1.charAt(i);
		}
		System.out.println(revS1);

		// Reverse using string builder

		StringBuilder sb = new StringBuilder(s1);
		System.out.println(sb.reverse());
		// Remove the junk characters Regular Expression
		String str = "@@@@@@@ Bikash 2019 #######";
		str = str.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(str);

		// Reverse an integer using while loop
		long num = 320019; // 910023
		long rev = 0;
		System.out.println(num);
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);

		//using String Buffer
		long num1 = 320019;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
		//find Missing Number In Array
		int[] ar = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;

		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];
		}
		System.out.println("Sum is :" + sum);
		int sum1 = 0;
		System.out.println(ar[(ar.length) - 1]);
		for (int j = 0; j <= ar[(ar.length) - 1]; j++) {
			sum1 = sum1 + j;
		}
		System.out.println("Sum 1 is :" + sum1);
		System.out.println("missing element is :" + (sum1 - sum));
	}

}
