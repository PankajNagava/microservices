package com.o;

public class FilePersistence extends BookPersistence {
    @Override
    public void save(Books book) {
        System.out.println("Saving book to file: " + book.getTitle());
    }
}
