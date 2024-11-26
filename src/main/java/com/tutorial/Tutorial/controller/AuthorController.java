package com.tutorial.Tutorial.controller;

import com.tutorial.Tutorial.entity.Author;
import com.tutorial.Tutorial.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author - rohit
 * Project - Tutorial
 * Package - com.tutorial.Tutorial.controller
 * Created_on - November 26 - 2024
 * Created_at - 20:09
 */

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping
    public String addAuthor(@RequestBody Author author) {
        return authorService.addAuthor(author);
    }
}
