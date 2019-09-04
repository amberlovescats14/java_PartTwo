package com.amber;

public class Employee {
    public int baseSalary;
    public int hourlyRate;

// because these variables are in our class we don't have to pass them
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
}
