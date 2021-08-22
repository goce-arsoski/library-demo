package com.library.librarydemo.controllers;

import com.library.librarydemo.models.Author;
import com.library.librarydemo.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthorsController {
    @Autowired
    AuthorService authorService;

//    @GetMapping("/books/{bookid}/authors")
//    private List<Author> getAllAuthors() {
//        return authorService.getAllAuthors();
//    }

    @GetMapping("/books/{bookid}/authors/{authorid}")
    private Author getAuthors(@PathVariable("authorid") int authorid) {
        return authorService.getAuthorById(authorid);
    }

    @PostMapping("/books/{booksid}/authors")
    private int saveAuthor(@RequestBody Author author) {
        authorService.saveOrUpdate(author);
        return author.getAuthorid();
    }

//    @PutMapping("/books/{bookid}/authors/{authorid}")
//    private Author update(@PathVariable("authorid") int authorid, @RequestBody Author author) {
//        authorService.saveOrUpdate(author);
//        return author;
//    }

//    @DeleteMapping("/books/{bookid}/authors/{authorid}")
//    private void deleteAuthor(@PathVariable("authorid") int authorid) {
//        authorService.delete(authorid);
//    }
}
