package hackerank;
import java.util.Arrays;

public class SocksMerchant {

	static int n=9;
	static int []ar= {10,20,20,10,10,30,50,10,20,50};
	public static void main(String[] args) {
	int count = 0;
	int temp=0;
	Arrays.sort(ar);
	for(n=1;n<ar.length;n++) {
		if(ar[n]==ar[n-1]) {
			count++;
		}
	}
		System.out.println(count);
	}

}
