package com.tutorial.Tutorial.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Author - rohit
 * Project - Tutorial
 * Package - com.tutorial.Tutorial.entity
 * Created_on - November 25 - 2024
 * Created_at - 19:29
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "book_table")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    //@Column(name = "book_name")
    private String name;
    private String author;
    private Long year;
}
