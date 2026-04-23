package com.exercises.interfaces;

public interface MoreSeries extends Series{
    int getMore();

    // using the keyword "default" we can have methods WITH BODIES in interfaces 
    // Default methods don’t have to be used in the classes, that implement this interface
    default void printHello() {
        // Look at that body, maan:
        System.out.println("Hello, I am a cool body of an interface method.");
    }
}
