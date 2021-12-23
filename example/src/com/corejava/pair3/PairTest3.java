package com.corejava.pair3;

import com.corejava.equals.Employee;
import com.corejava.equals.Manager;
import com.corejava.pair1.Pair;

/**
 * @version 16
 * @author dandan
 */
public class PairTest3 {
    public static void main(String[] args) {
        var ceo = new Manager("Gus Greedy", 800000,2003,12,15);
        var cfo = new Manager("Sid Sneaky", 600000, 2003,12,15);
        var buddies = new Pair<Manager>(ceo,cfo);
    }
    public static void printBuddies(Pair<? extends Employee> pair)
    {
        Employee first = pair.getFirst();
        Employee second = pair.getSecond();
        System.out.println(first.getName() + " and " + second.getName() + "" +
                " are buddies");
    }
    public static void minmaxBonus(Manager[] a, Pair<? super Manager> result)
    {
        if (a.length == 0) return;
        Manager min = a[0];
        Manager max = a[0];
    }
}
