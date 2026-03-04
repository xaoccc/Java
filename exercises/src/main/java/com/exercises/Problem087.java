package com.exercises;
// Description:
// Write a program that prints the hours of the day from 0:0 to 23:59, each on a separate line. The hours should be written in the format "{hour}:{minutes}".
// Solution:
public class Problem087 {
    public static void main(String[] args) {
        for (int h=0;h<24;h++) {            
            for (int m=0;m<60;m++) {
                System.out.printf("%d:%d\n", h, m);
            }
        }
    }
}
