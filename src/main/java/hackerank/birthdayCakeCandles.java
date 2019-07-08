package hackerank;
import java.util.Arrays;

public class birthdayCakeCandles {
	static int[] ar = { 18, 90, 90, 13, 90, 75, 90, 8, 90, 43 };

	public static void main(String[] args) {
		int temp = 0, count = 0;
		for (int i = 0; i < ar.length - 1; i++) {
			temp = ar[i];
			for (int j = i; j <= ar.length - 1; j++) {

				if (temp == ar[j]) {

					count += 1;
				}
			}
		}
		System.out.println(count);
	}
}
