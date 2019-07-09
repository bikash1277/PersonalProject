package javaInterviewQuestions;

public class FinallyConceptQ10 {

	public static void main(String[] args) {
		testFinally();
		testFinally2();
		division();
	}

	public static void testFinally() {
		try {
			System.out.println("This is new finally block......");
			throw new RuntimeException("test Finally!!!");
		} catch (Exception e) {
			System.out.println("inside catch block....");
		} finally {
			System.out.println("inside finally block....");
		}
	}

	public static void testFinally2() {
		try {
			System.out.println("inside try two....");
		} finally {
			System.out.println("inside test finally2....");
		}
		System.out.println("*******************************");
	}

	public static void division() {
		int i = 10;
		try {
			System.out.println("inside try block");
			int k = i / 0;
		} catch (ArithmeticException ae) {
			System.out.println("inside catch block...");
			System.out.println("divided by Zero...");
		} finally {
			System.out.println("inside finally block of division()...");
		}
	}
}
