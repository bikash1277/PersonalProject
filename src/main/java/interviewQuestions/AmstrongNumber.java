package interviewQuestions;

public class AmstrongNumber {

	public static void main(String[] args) {
		int num=150;
		int div=0,temp=num,a;
		while(num>0) {
			a=num%10;
			num=num/10;
			div=div+(a*a*a);
		}
		if(div==temp)
		System.out.println("amstrong number");
		else
			System.out.println("Not Amstrong Number");
	}

}
