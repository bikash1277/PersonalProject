package javaInterviewQuestions;

public class AbstractClassChild extends AbstractClassQ13 {

	public static void main(String[] args) {
		AbstractClassChild acc=new AbstractClassChild();
		acc.abstractMethodOne();
		acc.abstractMethodTwo();
		
	}

	@Override
	public void abstractMethodTwo() {
		System.out.println("This is method two....");

	}

}
