package com.tutorial.Tutorial.repository;

import com.tutorial.Tutorial.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author - rohit
 * Project - Tutorial
 * Package - com.tutorial.Tutorial.repository
 * Created_on - November 25 - 2024
 * Created_at - 19:41
 */

public interface BookRepository extends JpaRepository<Book, Integer> {
}
