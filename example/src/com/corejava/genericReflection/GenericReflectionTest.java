package com.corejava.genericReflection;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @version 16
 * @author dandan
 */
public class GenericReflectionTest {
    public static void main(String[] args) {
        //read class name from command line args or user input
        String name;
        if (args.length > 0)
            name = args[0];
        else {
            try (var in = new Scanner(System.in)){
                System.out.println("Enter class name (e.g.,java.util.Collections): ");
                name = in.next();
            }
        }
        try {
            //print generic info for class and public methods
            Class<?> cl = Class.forName(name);
            printClass(cl);
            for (Method method : cl.getDeclaredMethods())
                printMethod(method);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    public static void printClass(Class<?> cl)
    {
        System.out.print(cl);
        printTypes(cl.getTypeParameters(), "<", ",", ">", true);
        Type sc = cl.getGenericSuperclass();
        if (sc != null)
        {
            System.out.print(" extends ");
            printType(sc,false);
        }
        printTypes(cl.getGenericInterfaces(), "implements", ",", "", false);
        System.out.println();
    }
    public static void printMethod(Method method)
    {
        String name = method.getName();
        System.out.print(Modifier.toString(method.getModifiers()));
        System.out.print(" ");
        printTypes(method.getTypeParameters(), "<", ",", ">", true);

        printType(method.getGenericReturnType(),false);
        System.out.print(" ");
        System.out.print(name);
        System.out.print("(");
        printTypes(method.getGenericParameterTypes(), "", ", ", "", false);
        System.out.print(")");
    }
    public static void printTypes(Type[] types,String pre, String sep, String suf, boolean
                                  isDefinition)
    {
        if (pre.equals(" extends ") && Arrays.equals(types, new Type[] {Object.class}))
            return;
        if (types.length > 0) System.out.print(pre);
        for (int i = 0; i < types.length; i++)
        {
            if (i > 0) System.out.print(sep);
            printType(types[i],isDefinition );
        }
        if (types.length > 0) System.out.print(suf);
    }
    public static void printType(Type type, boolean isDefinition)
    {
        if (type instanceof Class)
        {
            var t = (Class<?>) type;
            System.out.print(t.getName());
        }
        else if (type instanceof TypeVariable)
        {
            var t = (TypeVariable<?>) type;
            System.out.print(t.getName());
            if (isDefinition)
                printTypes(t.getBounds(), " extends ", " & ", "", false);
        }
        else if (type instanceof WildcardType)
        {
            var t = (WildcardType) type;
            System.out.print("?");
            printTypes(t.getUpperBounds(), " extends ", " & ", "", false);
            printTypes(t.getLowerBounds(), " super ", " & ", "", false);
        }
        else if (type instanceof ParameterizedType)
        {
            var t = (ParameterizedType) type;
            Type owner = t.getOwnerType();
            if (owner != null)
            {
                printType(owner, false);
                System.out.print(".");
            }
            printType(t.getRawType(),false);
            printTypes(t.getActualTypeArguments(), "<", ", ", ">", false );
        }
        else if (type instanceof GenericArrayType)
        {
            var t = (GenericArrayType) type;
            System.out.print("");
            printType(t.getGenericComponentType(), isDefinition);
            System.out.print("[]");
        }
    }
}