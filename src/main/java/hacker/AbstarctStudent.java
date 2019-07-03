package hacker;

import java.util.*;

abstract class Book {
	String title;
	String author;

	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	abstract void display();
}
// Declare your class here. Do not use the 'public' access modifier.
// Declare the price instance variable
class MyBook extends Book {
	MyBook(String title, String author) {
		super(title, author);
	}
	@Override
	void display() {

	}
//}
/***
 * Class Constructor
 * 
 * @param title  The book's title.
 * @param author The book's author.
 * @param price  The book's price.
 **/
// Write your constructor here

/**
 * Method Name: display
 * 
 * Print the title, author, and price in the specified format.
 **/
// Write your method here

// End class

//public class Solution {

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