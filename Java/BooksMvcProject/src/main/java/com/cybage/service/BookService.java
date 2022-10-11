package com.cybage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cybage.model.Book;

@Service
public class BookService {

	List<Book> bookList = new ArrayList<>();

	public BookService() {
		bookList.add(new Book(1, "Java", "abc", "sdsd"));
		bookList.add(new Book(2, "Death Note", "ttyhyhy", "vbgfb"));
		bookList.add(new Book(3, "data Structure", "erer", "tygtde"));
		bookList.add(new Book(4, "History", "ghtht", "tht"));
		bookList.add(new Book(5, "Maths", "ghtht", "tht"));
		bookList.add(new Book(6, "Science", "ghtht", "tht"));
	}

	public List<Book> getBooks() {
		return bookList;
	}

	public void addBook(Book book) {

		bookList.add(book);
		System.out.println(bookList);

	}
	
	public Book getById(int bookId) {
		
		Book book1=bookList.stream().filter(book->book.getBookId()==bookId).findFirst().get();
		return book1;
	}
	
	public void editBook(int bookId , Book book) {
		Book toBeEditedBook = getById(bookId);
		toBeEditedBook.setBookName(book.getBookName());
		toBeEditedBook.setBookAuthor(book.getBookAuthor());
		toBeEditedBook.setBookPublisher(book.getBookPublisher());
	}
	
	public void deleteBook(int id) {
		bookList.remove(getById(id));
	}
}
