package com.tutorial.Tutorial.service;

import com.tutorial.Tutorial.entity.Book;
import com.tutorial.Tutorial.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Author - rohit
 * Project - Tutorial
 * Package - com.tutorial.Tutorial.service
 * Created_on - November 25 - 2024
 * Created_at - 19:42
 */

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book addBook(Book book) {
        // save book to database
        Book response = bookRepository.save(book);
        return response;
    }

    public Book getBook(int id) {
        //Optional<Book> optionalBook = bookRepository.findById(id);
//        if (optionalBook.isPresent()) {
//            return optionalBook.get();
//        } else {
//            return null;
//        }
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not present with Id: " + id));
        return book;
    }

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public void deleteBook(int id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not Present"));
        bookRepository.delete(book);
    }

    public Book updateBook(int id, Book book) {
        Book response = getBook(id);
        response.setName(book.getName());
        response.setAuthor(book.getAuthor());
        response.setYear(book.getYear());
        return bookRepository.save(response);
    }
}
