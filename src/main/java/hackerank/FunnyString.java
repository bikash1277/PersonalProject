package hackerank;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class FunnyString {

	public static void main(String[] args) {
		String s = "acxz";
		String rev = "";
		StringBuilder sbRes=new StringBuilder();
		char[] stringToCharArray = s.toCharArray();
		for (int i = 0; i < stringToCharArray.length; i++) {
			rev = rev + stringToCharArray[stringToCharArray.length - 1 - i];
		}
		try {
			byte[] Sbytes = s.getBytes("US-ASCII");
			byte[] Rbytes = rev.getBytes("US-ASCII");

			for (int i = 0; i < Sbytes.length; i++) {
				System.out.print(Sbytes[i] + " ");
			}
			System.out.println(" ");
			for (int i = Sbytes.length - 1; i > 0; i--) {
				System.out.print(Math.abs(Sbytes[i] - Sbytes[i - 1])+ " ");
			}
			System.out.println(" ");
			for (int i = 0; i < Rbytes.length; i++) {
				System.out.print(Rbytes[i] + " ");
			}
			System.out.println(" ");
			for (int i = Rbytes.length - 1; i > 0; i--) {
				System.out.print(Math.abs(Rbytes[i] - Rbytes[i - 1]) + " ");
			}
			System.out.println(" ");
			if (Arrays.equals(Sbytes, Rbytes)) {
				System.out.println("Funny");
			} else {
				System.out.println("Not Funny");
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
