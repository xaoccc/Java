package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Write a program that reads the day of the week (text) – entered by the user and 
// prints to the console the price of a movie ticket according to the day of the week.
// Solution:
public class Problem040 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String day = input.next();
            if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Friday")) {
                System.out.println(12);
            }
            else if (day.equals("Wednesday") || day.equals("Thursday")) {
                System.out.println(14);
            }
            else if (day.equals("Saturday") || day.equals("Sunday")) {
                System.out.println(16);
            }
            else {
                System.out.println("Invalid day!");
            }            
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}

