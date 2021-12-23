package com.corejava.ConstructorTest;

public class ConstructorTest {
    public static void main(String[] args) {
        var staff = new Employee[3];
        staff[0] = new Employee("Tom", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        //print out information about all Employee objects
        for (Employee e : staff)
        {
            System.out.println("name = " + e.getName() + ", id = " + e.getId() +
                    ",salary = " + e.getSalary());
        }
    }
}
