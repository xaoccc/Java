package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Write a program that reads an integer entered by the user and prints the day of the week (in English), 
// in the range [1...7] or prints "Error" in case the entered number is invalid.
// Solution:
public class Problem033 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int day = input.nextInt();
            if (day == 1) {
                System.out.println("Monday");
            }
            else if (day == 2) {
                System.out.println("Tuesday");
            }
            else if (day == 3) {
                System.out.println("Wednesday");
            }
            else if (day == 4) {
                System.out.println("Thursday");
            }
            else if (day == 5) {
                System.out.println("Friday");
            }
            else if (day == 6) {
                System.out.println("Saturday");
            }
            else if (day == 7) {
                System.out.println("Sunday");
            } 
            else {
                System.out.println("Error");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Input should be an integer!");
        }
    }
}
