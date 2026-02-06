package com.tashev;
import java.awt.Point;
import java.util.Date;

// Reference Data Types
public final class App {
    public static void main(String[] args) {
        dates();
        strings();
        points();
    }

    @SuppressWarnings("deprecation")
    public static void dates() {
        Date myDate = new Date(110, 4, 24);
        Date now = new Date();
        System.out.printf("Long ago it was %s but now it is %s\n", myDate, now);
    }

    // Reference Immutable Data Types (String)
    public static void strings() {
        String name = " Pesho ";
        String name2 = name.strip();
        char[] test = new char[10];

        for (byte i=0; i < name.length(); i++ ) {
            System.out.println(name.charAt(i));
            test[i] = name.charAt(i);
        }
        System.out.println(test);

        byte age = 5;
        byte newAge = age;
        age = 15;
        
        String food = "bob chorba";
        System.out.printf("My name is %s and I like %s a lot. I am %d years old. \n", name2, food, newAge);
    }

    // Reference Mutable Data Types (object)
    public static void points() {
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 3;
        // point2 points to the same place in memory as point1. Proof:
        System.out.println(point2);
    }       
    
}
