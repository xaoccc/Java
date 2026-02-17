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
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Input should be an integer!");
        }
    }
}
