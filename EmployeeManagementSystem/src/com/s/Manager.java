package com.s;

import com.i.ManagerDuties;

public class Manager implements Employee, ManagerDuties {
    private final double salary;

    public Manager(double salary) {
        this.salary = salary;
    }

    @Override
    public void performDuties() {
        System.out.println("Manager is managing teams and making strategic decisions.");
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public void conductMeetings() {
        System.out.println("Manager is conducting a meeting.");
    }

    @Override
    public void reviewPerformance() {
        System.out.println("Manager is reviewing performance.");
    }
}
