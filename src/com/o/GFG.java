package com.o;

public class GFG {
    public static void main(String[] args) {
        Books book = new Books("Effective Java", "Joshua Bloch", "987-654-321", 55.0);
        Invoice invoice = new Invoice(book, 3, 0.1, 0.05);
        
        invoice.printInvoice();
        
        // Save book using different persistence strategies
        PersistenceManager dbManager = new PersistenceManager(new DatabasePersistence());
        dbManager.saveBook(book);

        PersistenceManager fileManager = new PersistenceManager(new FilePersistence());
        fileManager.saveBook(book);
    }
}
