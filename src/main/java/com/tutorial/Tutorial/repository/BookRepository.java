package com.tutorial.Tutorial.repository;

import com.tutorial.Tutorial.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Author - rohit
 * Project - Tutorial
 * Package - com.tutorial.Tutorial.repository
 * Created_on - November 25 - 2024
 * Created_at - 19:41
 */

public interface BookRepository extends JpaRepository<Book, Integer> {

    // I want to fetch with name and author
    List<Book> findByName(String name);

    @Query("SELECT b FROM Book b WHERE b.name LIKE %:name%")
    List<Book> findByNameContainingIgnoreCase(@Param("name") String name);
}
