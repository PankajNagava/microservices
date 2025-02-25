package com.s;

public class Developer implements Employee {
    private final double salary;

    public Developer(double salary) {
        this.salary = salary;
    }

    @Override
    public void performDuties() {
        System.out.println("Developer is writing and reviewing code.");
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
