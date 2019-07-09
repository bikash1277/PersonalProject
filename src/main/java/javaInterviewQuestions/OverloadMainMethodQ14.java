package javaInterviewQuestions;

public class OverloadMainMethodQ14 {

	public static void main(String[] args) {

		System.out.println("This iss main method....");
		main(10);
		main(10,20);
	}
//JVM always find the main method with signature static void String array
	public static void main(int a) {

		System.out.println("This iss main int method....");
	}
	
	public static void main(String a) {

		System.out.println("This iss main String method....");
	}
	
	public static void main(int a,int b) {

		System.out.println("This iss main int 2 variables method....");
	}
	
	public static void main(String a,String b) {

		System.out.println("This iss main String 2 variables method....");
	}
}
