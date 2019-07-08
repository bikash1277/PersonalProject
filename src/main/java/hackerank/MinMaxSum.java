package hackerank;
import java.util.Arrays;

public class MinMaxSum {

	static int[] arr = { 1, 2, 3, 4, 5 };

	public static void main(String[] args) {
		int Sum = 0;
		Arrays.sort(arr);
		int MaxNum=arr[arr.length-1];
		int MinNum=arr[0];
		System.out.println(MaxNum+" "+MinNum);
		for (int i = 0; i < arr.length; i++) {		
			Sum = Sum + arr[i];
		}
		int SumMax=Sum-MaxNum;
		int SumMin=Sum-MinNum;
		System.out.println(SumMax +" "+ SumMin);
	}
}
