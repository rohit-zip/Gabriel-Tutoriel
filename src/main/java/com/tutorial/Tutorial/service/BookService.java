package com.tutorial.Tutorial.service;

import com.tutorial.Tutorial.entity.Author;
import com.tutorial.Tutorial.entity.Book;
import com.tutorial.Tutorial.repository.AuthorRepository;
import com.tutorial.Tutorial.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Autowired
    private AuthorRepository authorRepository;

    public Book addBook(Book book, int authorId) {
        Author author = authorRepository.findById(authorId)
                .orElseThrow(() -> new RuntimeException("Author not found with given Id"));
        book.setAuthor(author);
        return bookRepository.save(book);
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

    public List<Book> getByAuthorAndName(String author, String name) {
        return bookRepository.findByName(author);
    }

    public List<Book> getByNameLike(String name) {
        return bookRepository.findByNameContainingIgnoreCase(name);
    }
}
