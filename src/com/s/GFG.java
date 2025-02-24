package com.s;

public class GFG {
    public static void main(String[] args) {
        Book book = new Book("The Java Handbook", "Patrick Naughton", "123-456-789", 50.0);
        Employee emp = new Employee("Alice", "Developer", 70000);

        Invoice invoice = new Invoice(book, 2, 0.1, 0.05);
        invoice.printInvoice();

        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Role: " + emp.getRole());
        System.out.println("Salary: $" + emp.getSalary());
    }
}
