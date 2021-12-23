package com.corejava.anonymousInner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * This program demonstrates anonymous inner classes
 * @version 16 2021-03-16
 * @author dandan
 */
public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        var clock = new TalkingClock();
        clock.start(1000, true);

        //keep program running until the user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit the program?");
        System.exit(0);
    }
}
class TalkingClock
{
    /**
     * Starts the clock.
     * @param interval the interval between messages (in milliseconds)
     * @param beep true if the clock should beep
     */
    public void start(int interval, boolean beep)
    {
        var listener = new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                System.out.println("At the tone, the time is " +
                        Instant.ofEpochMilli(event.getWhen()));
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };
        var timer = new Timer(interval, listener);
        timer.start();
    }
}
