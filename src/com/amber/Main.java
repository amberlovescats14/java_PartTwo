package com.amber;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        var textBox1 = new TextBox(); // will detect what it is based on the new key
        textBox1.setText("Hello World");
        System.out.println(textBox1.text.toUpperCase());


        //------------------

        var employee = new Employee();
        //SET
        employee.setBaseSalary(60_000);
//        employee.baseSalary = 50_000;
        //GET
        employee.getBaseSalary();

        //SET
        employee.setHourlyRate(30);
        //GET
        employee.getHourlyRate();
        int wage = employee.calculateWage(10);
        System.out.println(wage);

    }
}
