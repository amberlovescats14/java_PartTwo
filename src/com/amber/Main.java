package com.amber;

public class Main {

    public static void main(String[] args) {
        var textBox1 = new TextBox(); // will detect what it is based on the new key
        textBox1.setText("Hello World");
        System.out.println(textBox1.text.toUpperCase());


        //------------------

        var employee = new Employee();
        employee.baseSalary = 50_000;
        employee.hourlyRate = 20;
        int wage = employee.calculateWage(10);
        System.out.println(wage);

    }
}
