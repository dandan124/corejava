package com.corejava.objectAnalyzer;

import java.util.*;

/**
 * This program uses reflection to spy objects.
 *
 * @author dandan
 * @version 16
 */
public class ObjectAnalyzerTest {
    public static void main(String[] args)
            throws ReflectiveOperationException {
        var squares = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++)
            squares.add(i * i);
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
