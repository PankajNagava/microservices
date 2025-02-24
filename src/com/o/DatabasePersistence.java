package com.o;

public class DatabasePersistence extends BookPersistence {
    @Override
    public void save(Books book) {
        System.out.println("Saving book to database: " + book.getTitle());
    }
}
