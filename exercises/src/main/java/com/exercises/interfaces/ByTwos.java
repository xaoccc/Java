package com.exercises.interfaces;

public class ByTwos implements Series {
    int value;

    // We MUST implement all methods from all the interfaces:
    // If we want to access them outside, they MUST have the keyword "public", even the constructor if there is such!
    public ByTwos() {
        this.value = 0;
    }    
    
    public int getNext() {
        value += 2;
        return value;
    }
}
