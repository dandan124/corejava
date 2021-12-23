package com.corejava.pair2;

import com.corejava.pair1.Pair;

import java.time.LocalDate;

/**
 * @version 1.18
 * @author dandan
 */
public class PairTest2 {
    public static void main(String[] args) {
        LocalDate[] birthday = {
                LocalDate.of(1906,12,9),//G.Hopper
                LocalDate.of(1815, 12, 10),//A.Lovelace
                LocalDate.of(1903, 12, 3),//J.von Neumann
                LocalDate.of(1910, 6, 22),//K.Zuse
        };
        Pair<LocalDate> mm = ArrayAlg.minmax(birthday);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}
