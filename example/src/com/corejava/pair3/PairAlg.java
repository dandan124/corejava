package com.corejava.pair3;

import com.corejava.pair1.Pair;

public class PairAlg {
    public static boolean hasNulls(Pair<?> pair)
    {
        return pair.getFirst() == null || pair.getSecond() == null;
    }
    public static void swap(Pair<?> pair)
    {
        swapHelper(pair);
    }
    public static <T> void swapHelper(Pair<T> pair)
    {
        T t = pair.getFirst();
        pair.setFirst(pair.getSecond());
        pair.setSecond(t);
    }
}
