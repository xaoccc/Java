package com.exercises;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Jesse decides that he wants to play basketball, but he needs equipment to practice. 
// Write a program that calculates the costs Jesse will incur if he starts practicing, 
// given the basketball training fee for 1 year. Equipment needed:
// • Basketball shoes – their price is 40% less than the fee for one year
// • Basketball team – their price is 20% cheaper than the sneakers
// • Basketball ball – their price is 1 / 4 of the price of the basketball team
// • Basketball accessories – their price is 1 / 5 of the price of the basketball
// 1 line is read from the console:
// · Annual basketball training fee – an integer in the range [0… 9999]
// Solution
public class Problem016 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Annual basketball training fee: ");
            int fee = input.nextInt();
            DecimalFormat df = new DecimalFormat();
            if (!isValid(fee)) {
                System.out.println("Invalid value! The input must be an integer between 0 and 9999.");
                return;
            }
            double shoesPrice = fee * (1 - 0.4);
            double teamPrice = shoesPrice * (1 - 0.2);
            double ballPrice = teamPrice * 0.25;
            double accPrice = ballPrice * 0.2;
            System.out.println(df.format(fee + shoesPrice + teamPrice + ballPrice + accPrice));

        } catch(InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }

    private static boolean isValid(int value) {
        return value > -1 && value < 10000;
    }
}
