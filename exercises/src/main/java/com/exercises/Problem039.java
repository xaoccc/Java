package com.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Write a program that reads the time of day (integer) and day of the week (text) - entered by the user and 
// checks whether the office of a company is open, as the office's working hours are from 10 am to 6 pm, Monday to Saturday inclusive.
// Solution:

public class Problem039 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int hour = input.nextInt();
            String day = input.next();
            if (day.equals("Monday")
                    || day.equals("Tuesday")
                    || day.equals("Wednesday")
                    || day.equals("Thursday")
                    || day.equals("Friday")
                    || day.equals("Saturday")) {
                if (hour > 9 && hour < 19) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
