package com.exercises.interfaces;

public class ByFives implements MoreSeries {
    int value;

    @Override
    public int getNext() {
        if (value + 5 >= MAX) {
            System.out.println(ERRORMSG);
        } else {
            value += 5;
        }
        return value;
    }
    @Override
    public int getMore() {
        // Here we skip the ERRORMSG on purpose!
        value += 500;
        return value;
    }

    // Using this method will override the default interface method
    @Override
    public void printHello() {
        System.out.println("This is an OVERRIDE!");
    }

    

}
