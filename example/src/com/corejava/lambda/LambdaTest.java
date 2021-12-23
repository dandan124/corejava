package com.corejava.lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

/**
 * This program demonstrates the ues of lambda expression
 * @version 16 2021-03-16
 * @author dandan
 */
public class LambdaTest {
    public static void main(String[] args) {
        var planets = new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter",
        "Saturn", "Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order: ");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length: ");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        var timer = new Timer(1000, event ->
                System.out.println("The time is " + new Date()));
        timer.start();

        //keep program running until user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
