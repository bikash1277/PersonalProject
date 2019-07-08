package hackerank;

public class GradingSystem {
	static int[] grade = { 73, 67, 38, 33 };
	public static void main(String[] args) {
		int mod,div;
		for (int i = 0; i < grade.length; i++) {
			if (grade[i] < 38) {
				System.out.println(grade[i]);
			} else {
				mod=grade[i]%5;
				if(mod>2) {
					grade[i]+=5-mod;
				}
			}
		}
	}
}