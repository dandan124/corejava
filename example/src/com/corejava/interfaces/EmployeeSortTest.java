package com.corejava.interfaces;

import java.util.*;

/**
 * This program demonstrates the use of the Comparable interface
 * @version 16 2021-03-16
 * @author dandan
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        var staff = new Employee[3];
        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Cral Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 38000);
        Arrays.sort(staff);
        //print out information about all Employee objects
        for (Employee e : staff)
            System.out.println("name = " + e.getName() + ",salary = " + e.getSalary());
    }
}
