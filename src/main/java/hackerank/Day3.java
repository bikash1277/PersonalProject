package hackerank;

public class Day3 {

	public static void main(String[] args) {
		int N=20;
		if(N%2!=0) {
			System.out.println("Weird");
		}
		else if((N%2==0 && N<=5&&N>=2)) {
			System.out.println("Not Weird");
		}
		else if(N%2==0 && N<=20&& N>=6) {
			System.out.println("Weird");
		}
		else if(N%2==0 && N>20) {
			System.out.println("Not Weird");
		}
		else {
			System.out.println("Please Enter value between 1 to 100");
		}
	}

}
