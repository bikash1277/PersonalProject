package javaInterviewQuestions;

public class Printpartten {

	public static void drawPyramidCompletePattern() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
	public static void drawPyramidHalfPattern() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
	public static void drawInvertedPyramidHalfPattern() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5-i; j++) {
                System.out.print("* ");
            }
//            for (int k = 0; k <= i; k++) {
//                System.out.print("* ");
//            }
            System.out.println();
        }
    }

	public static void main(String[] args) {
//		drawPyramidCompletePattern();
//		drawPyramidHalfPattern();
		drawInvertedPyramidHalfPattern();
	}

}
