package hackerank;

public class TwoDimDigonal {

	static int[][] arr = { { 1, 12, 15 }, { 2, 15, 4 }, { 14, 7, -12 } };

	public static void main(String[] args) {
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					sum1 += arr[i][j];
				}
				if(i==arr.length-j-1) {
					sum2 += arr[i][j];
				}

			}
		}
		System.out.println(sum1);
		System.out.println(sum2);
	}
}
