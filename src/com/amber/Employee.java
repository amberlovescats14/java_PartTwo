package com.amber;

import java.lang.IllegalAccessException;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

// because these variables are in our class we don't have to pass them
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    //SETTER
    public void setBaseSalary(int baseSalary) throws IllegalAccessException {
        if(baseSalary <= 0) throw new IllegalAccessException("Salary cannot be 0 or less");
        this.baseSalary = baseSalary;
    }

    //GETTER
    public int getBaseSalary() {
        return baseSalary;
    }

    //SETTER
    public void setHourlyRate(int hourlyRate) throws IllegalAccessException {
        if(hourlyRate <=0 ) throw new IllegalAccessException("Hourly rate must be greater than 0");
        this.hourlyRate = hourlyRate;
    }

    //GETTER
    public int getHourlyRate() {
        return hourlyRate;
    }


}
