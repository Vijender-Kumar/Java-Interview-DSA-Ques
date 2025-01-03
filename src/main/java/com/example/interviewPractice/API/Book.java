package com.example.interviewPractice.API;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private String name;
    private String author;

    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }
}

class BookPrinter{
    public void printBook(Book book){
        System.out.println(book.getName()+", "+ book.getAuthor());
    }
}
