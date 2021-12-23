package com.corejava.map;

import com.corejava.equals.Employee;

import java.util.HashMap;

/**
 * This program demonstrates the use of a map with key type String and value type Employee.
 * @version 16
 * @author dandan
 */
public class MapTest {
    public static void main(String[] args) {
        var staff = new HashMap<String, Employee>();
        staff.put("144-25-5464", new Employee("Amy Lee"));
        staff.put("567-24-2546", new Employee("Harry Hacker"));
        staff.put("157-62-5638", new Employee("Gary Cooper"));
        staff.put("789-35-1234", new Employee("Francesca Cruz"));

        //print all entries
        System.out.println(staff);

        //remove an entry
        staff.remove("157-62-5638");

        //replace an entry
        staff.put("345-65-5678", new Employee("Francesca Miller"));

        //look up a value
        System.out.println(staff.get("144-25-5464"));

        //iterate through all entries

        staff.forEach((k,v) ->
                System.out.println("key = " + k + ", value = " + v));
    }
}
