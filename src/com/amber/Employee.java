package com.amber;

import java.lang.IllegalAccessException;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    //constructor
    public  Employee(int baseSalary, int hourlyRate) throws IllegalAccessException {
        setBaseSalary((baseSalary));
        setHourlyRate(hourlyRate);
    }

    // because these variables are in our class we don't have to pass them
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    //SETTER -- PRIVATE, only used in constructor
    private void setBaseSalary(int baseSalary) throws IllegalAccessException {
        if(baseSalary <= 0) throw new IllegalAccessException("Salary cannot be 0 or less");
        this.baseSalary = baseSalary;
    }

    //GETTER -- PRIVATE for DECOUPLING
    private int getBaseSalary() {
        return baseSalary;
    }

    //SETTER -- PRIVATE BEcause we are using it in constructor
    private void setHourlyRate(int hourlyRate) throws IllegalAccessException {
        if(hourlyRate <=0 ) throw new IllegalAccessException("Hourly rate must be greater than 0");
        this.hourlyRate = hourlyRate;
    }

    //GETTER -- PRIVATE FOR DECOUPLING
    private int getHourlyRate() {
        return hourlyRate;
    }

    // ABSTRACTION: Hide unnecessary details
    // COUPLING: how much u are dependant on something --- delete stuff that u are not using



}
