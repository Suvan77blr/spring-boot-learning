package com.example.MyBookCRUD.controller;

import com.example.MyBookCRUD.model.Book;
import com.example.MyBookCRUD.services.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public String greet() {
        return "Hai there! .. Welcome to the Book-CRUD Application!";
    }
    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/get/{bookId}")
    public Book getBook(@PathVariable String bookId) {
        return bookService.getBook(bookId);
    }

    @PostMapping("/createBook")
    public Book createBook(@RequestBody Book book) {
        return bookService.create(book);
    }

    @PutMapping("/updateBook/{bookId}")
    public Book updateBook(@RequestBody Book book, @PathVariable String bookId) {
        return bookService.updateBook(book, bookId);
    }

    @DeleteMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable String bookId) {
        bookService.delete(bookId);
        return bookId+" deleted!";
    }

    @DeleteMapping("/deleteAll")
    public String deleteBooks() {
        bookService.deleteAll();
        return "All Books data has been deleted!";
    }

    @GetMapping("/temp")
    public String hai() {
        return bookService.hai();
    }
}