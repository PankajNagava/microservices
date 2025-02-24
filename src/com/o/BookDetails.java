package com.o;

public class BookDetails {
    public void printBookInfo(Books book) {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Price: $" + book.getPrice());
    }
}
