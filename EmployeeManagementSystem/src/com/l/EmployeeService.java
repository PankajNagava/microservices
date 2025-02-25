package com.l;

import com.s.Employee;

public class EmployeeService {
    public static void displayEmployeeDetails(Employee employee) {
        System.out.println("Employee Duties: ");
        employee.performDuties();
    }
}
