package com.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// A fruit shop operates at the following prices during weekdays:
// fruit banana apple orange grapefruit kiwi pineapple grapes
// price 2.50 1.20 0.85 1.45 2.70 5.50 3.85
// On Saturdays and Sundays, the shop operates at higher prices:
// fruit banana apple orange grapefruit kiwi pineapple grapes
// price 2.70 1.25 0.90 1.60 3.00 5.60 4.20
// Write a program that reads from the console fruit (banana / apple / orange / grapefruit / kiwi / pineapple / grapes), 
// day of the week (Monday / Tuesday / Wednesday / Thursday / Friday /
// Saturday / Sunday) and quantity (decimal number) entered by the user, and calculates the price according to 
// the prices from the tables above. In case of invalid day of the week or invalid fruit name, print "error".
// Solution:

public class Problem043 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String fruit = input.next();
            String day = input.next();
            double quantity = input.nextDouble();
            if (day.equals("Monday")
                    || day.equals("Tuesday")
                    || day.equals("Wednesday")
                    || day.equals("Thursday")
                    || day.equals("Friday")) {
                switch (fruit) {
                    case "banana":
                        System.out.printf("%.2f", 2.5 * quantity);
                        break;
                    case "apple":
                        System.out.printf("%.2f", 1.2 * quantity);
                        break;
                    case "orange":
                        System.out.printf("%.2f", 0.85 * quantity);
                        break;
                    case "grapefruit":
                        System.out.printf("%.2f", 1.45 * quantity);
                        break;
                    case "kiwi":
                        System.out.printf("%.2f", 2.7 * quantity);
                        break;
                    case "pineapple":
                        System.out.printf("%.2f", 5.5 * quantity);
                        break;
                    case "grapes":
                        System.out.printf("%.2f", 3.85 * quantity);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
            }
            else if (day.equals("Saturday")
                    || day.equals("Sunday")) {
                switch (fruit) {
                    case "banana":
                        System.out.printf("%.2f", 2.7 * quantity);
                        break;
                    case "apple":
                        System.out.printf("%.2f", 1.25 * quantity);
                        break;
                    case "orange":
                        System.out.printf("%.2f", 0.9 * quantity);
                        break;
                    case "grapefruit":
                        System.out.printf("%.2f", 1.6 * quantity);
                        break;
                    case "kiwi":
                        System.out.printf("%.2f", 3.0 * quantity);
                        break;
                    case "pineapple":
                        System.out.printf("%.2f", 5.6 * quantity);
                        break;
                    case "grapes":
                        System.out.printf("%.2f", 4.2 * quantity);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
            } else {
                System.out.println("error");
            }

        } catch (InputMismatchException e) {
            System.out.println("error");
        }
    }
}
