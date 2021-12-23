package com.corejava.timer;

import javax.swing.*;
/**
 * @version 16 2021-03-16
 * @author dandan
 */
public class TimerTest {
    public static void main(String[] args) {
        var listener = new TimePrinter();
        //construct a timer that calls the listener
        //once every second
        var timer = new Timer(1000,listener);
        timer.start();

        //keep program running until the user selects "OK"
        JOptionPane.showMessageDialog(null,"Quit program");
        System.exit(0);

    }
}
