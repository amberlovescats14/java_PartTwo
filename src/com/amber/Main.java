package com.amber;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        var textBox1 = new TextBox(); // will detect what it is based on the new key
        textBox1.setText("Hello World");
        System.out.println(textBox1.text.toUpperCase());


        //------------------

//        var employee = new Employee();
//        //SET
//        employee.setBaseSalary(60_000);
////        employee.baseSalary = 50_000;
//        //GET
////        employee.getBaseSalary();
//
//        //SET
//        employee.setHourlyRate(30);
//        //GET
////        employee.getHourlyRate();
//        int wage = employee.calculateWage(10);
//        System.out.println(wage);

//---------------------------
        //VERY DE COUPLED
        var browser = new Browser();
        browser.navigate("123.01.34");

//-----------------------
        // EMPLOYEE SIMPLIFIED
        var employee = new Employee(60_000, 30);
        int wage = employee.calculateWage(20);
        System.out.println(wage);
//---------------------------
        //STATIC to the Employee class
        Employee.printNumberOfEmployees();

    }
}
// Class is a blueprint / an Object in an instance of a class;
// INSTANTIATING = creating a new instance;
// STACK stores variables / HEAP gets emptied by JAVA when not needed
//The problem with PROCEDURAL code is it creates COUPLING, which is the dependency of one class to another;
   //procedural coding requires passing variables around. it is repetitive
// ENCAPSULATION is using GETTERS and SETTERS
// We declare fields as PRIVATE so that we dont access them from the main:: No bad state
// ABSTRACTION hides unnecessary detail from the public:: reduces complexity
// COUPLING is the dependency of one class on another
// abstraction helps because if we change one class, we will not have to change all the other oens
// constructors takes all the parameters in upon the initial instance, less guessing involved
// method overloading is calling a method inside itself, incase 0 or nothing is passed. Instead of using if statments
//static methods are methods and variables that need to be independent of each instance.
   // they belong to the class itself