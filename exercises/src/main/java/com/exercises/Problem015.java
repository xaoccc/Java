package com.exercises;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// A restaurant opens its doors and offers several menus at preferential prices:
// • Chicken menu – 10.35 lv.
// • Fish menu – 12.40 lv.
// • Vegetarian menu – 8.15 lv.
// Write a program that calculates how much it will cost for a group of people to order takeout.
// The group will also order a dessert, the price of which is equal to 20% of the total bill (excluding delivery).
// The delivery price is 2.50 lv. and is charged at the end.
// 3 lines are read from the console:
// · Number of chicken menus – integer in the interval [0 … 99]
// · Number of fish menus – integer in the interval [0 … 99]
// · Number of vegetarian menus – integer in the interval [0 … 99]
// Solution
public class Problem015 {
    public static void main(String[] args) {
        double CHICKEN_MENU = 10.35;
        double FISH_MENU = 12.4;
        double VEG_MENU = 8.15;
        double DESERT_COEF = 1.2;
        double DELIVERY = 2.5;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Number of chicken menus: ");
            int chickenQty = input.nextInt();

            System.out.print("Number of fish menus: ");
            int fishQty = input.nextInt();

            System.out.print("Number of vegetarian menus: ");
            int vegQty = input.nextInt();
            DecimalFormat df = new DecimalFormat();

            if (!isValid(chickenQty) || !isValid(fishQty) || !isValid(vegQty)) {
                System.out.println("Invalid value! The value must be an integer between 0 and 99!");
                return;
            }

            double total = (((CHICKEN_MENU * chickenQty) + (FISH_MENU * fishQty) + (VEG_MENU * vegQty)) * DESERT_COEF) + DELIVERY;
            System.out.println(df.format(total));

        } catch(InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }

    private static boolean isValid(int value) {
        return value > -1 && value < 100;
    }
}
