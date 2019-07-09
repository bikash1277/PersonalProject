package interviewQuestions;

public class SumOfPairs {

	public static void main(String[] args) {
		int sum=5;
		int[] numbers = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };
				for(int i=0; i<numbers.length-1;i++) {
					for(int j=1;j<numbers.length;j++) {
						if(numbers[i]+numbers[j]==sum) {
							System.out.println("numbers are: ("+numbers[i]+","+numbers[j]+")");
						}
					}
				}
		
	}

}
