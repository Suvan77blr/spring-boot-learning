package com.example.MyBookCRUD.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Table
//@Component
public class Book {
    @Id
    private String id;

    @Column
    private String author;

    @Column
    private String title;

    public Book(){}

    public Book(String id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}