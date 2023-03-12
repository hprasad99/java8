package com.learn.lambda.example.dao;

import com.learn.lambda.example.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(101, "Core Java", 400));
        books.add(new Book(102, "Hibernate", 180));
        books.add(new Book(103, "Spring", 200));
        books.add(new Book(104, "WebService", 1400));
        return books;
    }
}
