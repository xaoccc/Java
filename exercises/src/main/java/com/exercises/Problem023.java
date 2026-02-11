package com.exercises;
import java.util.Scanner;
// Description:
// Write a program that reads a speed (real number) entered by the user and prints information about the speed.
// • For speeds up to 10 (inclusive) print "slow"
// • For speeds above 10 and up to 50 (inclusive) print "average"
// • For speeds above 50 and up to 150 (inclusive) print "fast"
// • For speeds above 150 and up to 1000 (inclusive) print "ultra fast"
// • For higher speeds print "extremely fast"
// Solution:
public class Problem023 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double speed = input.nextDouble();
            if (speed <= 10.0) {
                System.out.println("slow");
            } 
            else if (speed <= 50.0) {
                System.out.println("average");
            } 
            else if (speed <= 150.0) {
                System.out.println("fast");
            } 
            else if (speed <= 1000.0) {
                System.out.println("ultra fast");
            } 
            else 
                System.out.println("extremely fast");
        }
    }
}
