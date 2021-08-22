package com.library.librarydemo.controllers;

import com.library.librarydemo.models.Book;
import com.library.librarydemo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BooksController {
    @Autowired
    BookService bookService;

    @GetMapping("/books")
    private List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/books/{bookid}")
    private Book getBooks(@PathVariable("bookid") int bookid) {
        return bookService.getBookById(bookid);
    }

    @PostMapping("/books")
    private int saveBook(@RequestBody Book book) {
        bookService.saveOrUpdate(book);
        return book.getBookid();
    }

    @PutMapping("/books/{bookid}")
    private Book update(@RequestBody Book book) {
        bookService.saveOrUpdate(book);
        return book;
    }

    @DeleteMapping("/books/{bookid}")
    private void deleteBook(@PathVariable("bookid") int bookid) {
        bookService.delete(bookid);
    }
}
