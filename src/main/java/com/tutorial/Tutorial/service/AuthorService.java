package com.tutorial.Tutorial.service;

import com.tutorial.Tutorial.entity.Author;
import com.tutorial.Tutorial.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author - rohit
 * Project - Tutorial
 * Package - com.tutorial.Tutorial.service
 * Created_on - November 26 - 2024
 * Created_at - 20:07
 */

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public String addAuthor(Author author) {
        Author response = authorRepository.save(author);
        return "Author created with Author Id : " + response.getAuthorId();
    }
}
