package com.d;

import com.s.*;
import com.o.EmployeeSalaryCalculator;
import com.l.EmployeeService;
import com.i.ManagerDuties;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager(85000);
        Employee developer = new Developer(60000);
        Employee securityGuard = new SecurityGuard(35000);

        EmployeeService.displayEmployeeDetails(manager);
        EmployeeService.displayEmployeeDetails(developer);
        EmployeeService.displayEmployeeDetails(securityGuard);

        EmployeeSalaryCalculator.printSalary(manager);
        EmployeeSalaryCalculator.printSalary(developer);
        EmployeeSalaryCalculator.printSalary(securityGuard);

        // Special actions for Manager
        if (manager instanceof ManagerDuties) {
            ((ManagerDuties) manager).conductMeetings();
            ((ManagerDuties) manager).reviewPerformance();
        }
    }
}
