package com.exercises;
// Description:
// Print all numbers from 1 to 1000 ending in 7.
// Solution:
public class Problem064 {
    public static void main(String[] args) {
        for (int i = 7; i < 1000; i+=10) {
            System.out.println(i);
        }
    }
}
