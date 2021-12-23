package com.corejava.ConstructorTest;

import java.util.Random;

public class Employee {
    private static int nextId;
    private int id;
    private String name = "";       //instance field initialized
    private double salary;
    //static initialization block
    static
    {
        var generator = new Random();
        //set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
    }
    //object initialization block
    {
        id = nextId;
        nextId++;
    }
    //three overloaded constructors
    public Employee(String nName, double sSalary)
    {
        name = nName;
        salary = sSalary;
    }
    public Employee(double sSalary)
    {
        //calls the Employee (String, double) constructor
        this("Employee #" + nextId, sSalary);
    }
    //the default constructor
    public Employee()
    {
        //name initialized to ""--see above
        //salary not explicitly set -- initialized to 0
        //id initialized in initialized block
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}
