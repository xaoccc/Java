package com.exercises.interfaces;

public interface Series {
    // We can define variables as well. These are available to all classes, which implement the interface. Cool!
    int MAX = 15;
    String ERRORMSG = "Max value reached";

    // We can define as many methods as we want, but all of them must be in the classes that implement the interface
    int getNext();
}
