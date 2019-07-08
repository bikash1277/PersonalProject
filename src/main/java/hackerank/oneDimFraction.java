package hackerank;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class oneDimFraction {
	static int[] arr = { -4, 3, -9, 0, 4, 1 };

	public static void main(String[] args) {
		DecimalFormat dec = new DecimalFormat("0.0000000");
		double j = 0;
		double k = 0;
		double l = 0;
		int len=arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				j++;
			} else if (arr[i] < 0) {
				k++;
			} else {
				l++;
			}
					}
		System.out.println("length is "+len);
		System.out.println(j +" "+k+" "+l+" ");
		System.out.println(dec.format(j / arr.length));
		System.out.println(dec.format(k / arr.length));
		System.out.println(dec.format(l / arr.length));

	}
}