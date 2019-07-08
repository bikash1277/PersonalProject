package interviewQuestions;

public class PrimeNumberQ16 {

	public static boolean isPrimeNumber(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void getPrimeNumber(int num) {
		for(int i=2;i<=num;i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i +" ");
			}
		}
	}
	public static void main(String[] args) {
		int num=17;
		System.out.println(num+" : prime number is :"+isPrimeNumber(num));
		getPrimeNumber(num);
	}

}
