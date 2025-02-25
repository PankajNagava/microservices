package com.o;

import com.s.Employee;

public class EmployeeSalaryCalculator {
    public static void printSalary(Employee employee) {
        System.out.println("Salary: $" + employee.calculateSalary());
    }
}
