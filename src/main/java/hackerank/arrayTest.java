package hackerank;

public class arrayTest {
	public static int []ar= {1, 2, 3, 4, 10, 11};
	public static void main(String[] args) {
	int sum=0;
	System.out.println(ar.length);
	for(int i=0;i<ar.length;i++) {
	 sum=sum+ar[i];
	}
	System.out.println(sum);
	}
}
