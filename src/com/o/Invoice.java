package com.o;

public class Invoice {
    private Books book;
    private int quantity;
    private double discountRate;
    private double taxRate;
    private double total;

    public Invoice(Books book, int quantity, double discountRate, double taxRate) {
        this.book = book;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.taxRate = taxRate;
        this.total = this.calculateTotal();
    }

    private double calculateTotal() {
        double price = ((book.getPrice() - book.getPrice() * discountRate) * this.quantity);
        return price * (1 + taxRate);
    }

    public double getTotal() {
        return total;
    }

    public void printInvoice() {
        System.out.println(quantity + "x " + book.getTitle() + " @ $" + book.getPrice());
        System.out.println("Discount Rate: " + discountRate);
        System.out.println("Tax Rate: " + taxRate);
        System.out.println("Total: $" + total);
    }
}
