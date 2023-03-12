package com.learn.lambda.example.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    private int id;
    private String name;
    private int pages;
}
