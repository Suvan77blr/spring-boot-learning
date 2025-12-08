package com.example.MyBookCRUD.services;

import com.example.MyBookCRUD.model.Book;
import com.example.MyBookCRUD.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBook(String bookId) {
        return bookRepository.findById(bookId).orElse(null);
    }

    public Book create(Book book) {
        return bookRepository.save(book);
    }

    public void delete(String bookId) {
        bookRepository.deleteById(bookId);
    }

//    public Book updateBook(Book book, String bookId) {
//        Book book1 = bookRepository.findById(bookId).get();
//        book1.setAuthor(book.getAuthor());
//        book1.setPublisher(book.getPublisher());
//        bookRepository.save(book1);
//        return book1;
//    }

    public Book updateBook(Book updatedBook, String bookId) {
        return bookRepository.findById(bookId)
                .map(existingBook -> {
                    existingBook.setTitle(updatedBook.getTitle());
                    existingBook.setAuthor(updatedBook.getAuthor());
                    return bookRepository.save(existingBook);
                })
                .orElseThrow(() -> new RuntimeException("Book not found with id: " + bookId));
    }


    public void deleteAll() {
        bookRepository.deleteAll();
    }

    public String hai()
    {
        return "Hai";
    }
}