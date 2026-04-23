package com.exercises.interfaces;

public class ByThrees implements Series {

    int value;

    public ByThrees() {
        this.value = 0;
    }

    @Override
    public int getNext() {
        if (value + 3 >= MAX) {
            System.out.println(ERRORMSG);
        } else {
            value += 3;
        }
        return value;
    }

}
