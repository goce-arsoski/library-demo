package com.library.librarydemo.services;

import com.library.librarydemo.models.Author;
import com.library.librarydemo.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

//    // getting all authors
//    public List<Author> getAllAuthors() { return authorRepository.findAll(); }

    // getting a specific author
    public Author getAuthorById(int id){
        return authorRepository.findById(id).get();
    }

    // creating a new author
    public void saveOrUpdate(Author author) { authorRepository.save(author); }

//    // updating existing author
//    public void update(Author author, int authorid) { authorRepository.save(author); }
//
//    // deleting existing author
//    public void delete(int id) { authorRepository.deleteById(id); }
}
