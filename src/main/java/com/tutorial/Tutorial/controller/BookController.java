package com.tutorial.Tutorial.controller;

import com.tutorial.Tutorial.entity.Book;
import com.tutorial.Tutorial.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author - rohit
 * Project - Tutorial
 * Package - com.tutorial.Tutorial.controller
 * Created_on - November 25 - 2024
 * Created_at - 19:48
 */

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/add")
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @GetMapping("/get-book/{id}")
    public Book getBook(@PathVariable int id) {
        return bookService.getBook(id);
    }

    @GetMapping
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
        return "Deleted";
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Book book) {
        return bookService.updateBook(id, book);
    }
}
