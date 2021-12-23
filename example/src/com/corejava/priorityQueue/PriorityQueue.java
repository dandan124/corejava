package com.corejava.priorityQueue;

import java.time.LocalDate;

/**
 * This program demonstrates the use of a priority queue
 * @version 16
 * @author dandan
 */
public class PriorityQueue {
    public static void main(String[] args) {
        var pq = new java.util.PriorityQueue<LocalDate>();
        pq.add(LocalDate.of(1906, 12, 9)); //G.Hopper
        pq.add(LocalDate.of(1815, 12, 10)); //A.Lovelace
        pq.add(LocalDate.of(1903, 12, 3)); //J. von Neumann
        pq.add(LocalDate.of(1910, 6,22)); //K. Zuse

        System.out.println("Iterating over elements ..... ");
        for (LocalDate date : pq)
            System.out.println(date);
        System.out.println("Removing elements ....... ");
        while (!pq.isEmpty())
            System.out.println(pq.remove());
    }
}
