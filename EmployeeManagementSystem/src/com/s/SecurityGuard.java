package com.s;

public class SecurityGuard implements Employee {
    private final double salary;

    public SecurityGuard(double salary) {
        this.salary = salary;
    }

    @Override
    public void performDuties() {
        System.out.println("Security Guard is monitoring premises.");
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
