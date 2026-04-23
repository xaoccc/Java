package com.exercises.interfaces;

public class Main {

    public static void main(String[] args) {
        ByTwos test = new ByTwos();
        for (int i=0; i<5; i++) {
            System.out.println(test.getNext());
        }
    }    

}

