package com.tutorial.Tutorial.repository;

import com.tutorial.Tutorial.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author - rohit
 * Project - Tutorial
 * Package - com.tutorial.Tutorial.repository
 * Created_on - November 26 - 2024
 * Created_at - 20:07
 */

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
