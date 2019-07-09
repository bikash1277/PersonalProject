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
	public static void drawPyramidInvertedCompletePattern() {
        for (int i = 5; i >0; i--) {
            for (int j = 5 - i; j>0 ; j--) {
                System.out.print(" ");
            }
            for (int k = i; k >0; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
	public static void drawPyramidLeftHalfPattern() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
	public static void drawPyramidInvertedLeftHalfPattern() {
        for (int i = 5; i > 0; i--) {
            for (int j = 5-i; j >0; j--) {
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
            System.out.println();
        }
    }

	public static void drawHorizonPattern() {
        for (int i = 5; i >0; i--) {
            for (int j = 5 - i; j>0 ; j--) {
                System.out.print("_");
            }
            for (int k = i; k >0; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
//		drawPyramidCompletePattern();
//		System.out.println();
//		drawPyramidLeftHalfPattern();
//		System.out.println();
		drawHorizonPattern();
		System.out.println();

	}

}
