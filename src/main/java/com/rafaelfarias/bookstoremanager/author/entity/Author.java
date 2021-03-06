package com.rafaelfarias.bookstoremanager.author.entity;

import com.rafaelfarias.bookstoremanager.books.entity.Book;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(columnDefinition = "integer default 0")
    private int age;

    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private List<Book> books;
}
