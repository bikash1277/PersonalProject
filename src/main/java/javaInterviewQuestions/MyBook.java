package javaInterviewQuestions;

abstract class Book {
	String title;
	String author;

	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	abstract void display();
}
class MyBook extends Book {
	MyBook(String title, String author) {
		super(title, author);
	}
	void display() {

	}
}