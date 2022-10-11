package com.cybage.model;

import javax.validation.constraints.NotBlank;

public class Book {
	private int bookId;
	@NotBlank
	private String bookName;
	@NotBlank
	private String bookAuthor;
	@NotBlank
	private String bookPublisher;

	public Book() {
		super();
	}

	public Book(int bookId, String bookName, String bookAuthor, String bookPublisher) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPublisher = bookPublisher;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPublisher="
				+ bookPublisher + "]";
	}

}
