package com.corejava.fullMoons;

import java.util.Calendar;

public class FullMoons {
    static int DAY_IM = 1000 * 60 * 60 * 24;

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2021, 8, 2, 9, 40);
        long day1 = c.getTimeInMillis();
        for (int x = 0; x < 60; x++) {
            day1 += (DAY_IM * 29.52);
            c.setTimeInMillis(day1);
            System.out.println(String.format("full moon on %tc", c));
        }
    }
}
