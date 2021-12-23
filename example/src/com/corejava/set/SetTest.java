package com.corejava.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * This program uses a set to print all unique words in System.in
 * @version 16
 * @author dandan
 */
public class SetTest {
    public static void main(String[] args) {
        var words = new HashSet<String>();
        long totalTime = 0;

        try (var in = new Scanner(System.in)){
            while (in.hasNext())
            {
                String word = in.next();
                long callTime  = System.currentTimeMillis();
                words.add(word);
                callTime = System.currentTimeMillis() - callTime;
                totalTime += callTime;
            }
        }
        Iterator<String> iterator = words.iterator();
        for (int i = 1; i <= 20 && iterator.hasNext(); i++)
            System.out.println(iterator.next());
        System.out.println("......");
        System.out.println(words.size() + "distinct words." + totalTime + "millSeconds");
    }
}
