package interviewQuestions;

import java.util.*;
public class childBook{
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String title = scanner.nextLine();
	String author = scanner.nextLine();
	int price = scanner.nextInt();
	scanner.close();

	Book book = new MyBook(title, author);
	book.display();
}
}