package com.library.librarydemo.services;

import com.library.librarydemo.models.Book;
import com.library.librarydemo.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    // getting all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // getting a specific book
    public Book getBookById(int id){
        return bookRepository.findById(id).get();
    }

    // creating a new book
    public void saveOrUpdate(Book book) {
        if (book.getGenre().equals("fiction") || book.getGenre().equals("nonfiction"))
        bookRepository.save(book);
        else System.out.println("Please insert one of following genre: fiction or nonfiction!");
    }

    // updating existing book
    public void update(Book book, int bookId) {
        bookRepository.save(book);
    }

    // deleting existing book
    public void delete(int id) {
        bookRepository.deleteById(id);
    }
}
