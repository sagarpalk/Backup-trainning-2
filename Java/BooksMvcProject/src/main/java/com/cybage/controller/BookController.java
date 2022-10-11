package com.cybage.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cybage.model.Book;
import com.cybage.service.BookService;

@Controller
@RequestMapping("/book/management")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/allbooks")
	public ModelAndView getAllBooks() {
		
		List<Book> bookList=bookService.getBooks();
		return new ModelAndView("allbooks","bookList",bookList);
		
	}
	
	@GetMapping("/addbook")
	public ModelAndView showAddBookForm() {
		
		Book book=new Book();
		return new ModelAndView("addbook","book",book);
	}
	
	@PostMapping("/bookadd")
	public ModelAndView addBook(@Valid @ModelAttribute Book book,BindingResult result) {

		if(result.hasErrors())
			return new ModelAndView("addbook","book",book);
		bookService.addBook(book);
		return new ModelAndView("allbooks","bookList",bookService.getBooks());
	}
	
	@GetMapping("/edit/{bookId}")
	public ModelAndView showFormForBookEdit(@PathVariable int bookId) {
		Book book = bookService.getById(bookId);
		return new ModelAndView("editbook" , "book" , book);
	}
	
	@PostMapping("/afterEdit/{bookId}")
	public ModelAndView getAllBooksAfterEdit(@PathVariable int bookId , @ModelAttribute Book book) {
		bookService.editBook(bookId, book);
		List<Book> bookList=bookService.getBooks();
		return new ModelAndView("allbooks","bookList",bookList);
		
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView deleteBook(@PathVariable int id) {
		bookService.deleteBook(id);
		List<Book> bookList=bookService.getBooks();
		return new ModelAndView("allbooks","bookList",bookList);
	}
}
