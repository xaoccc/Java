package com.exercises;
import java.util.Scanner;
// Description:
// Lily is now N years old. For each of her birthdays she receives a gift.
// • For odd birthdays (1, 3, 5...n) she receives toys.
// • For even birthdays (2, 4, 6...n) she receives money.
// For her second birthday she receives 10.00 lv, and the amount increases by 10.00 lv for each subsequent even 
// birthday (2 -> 10, 4 -> 20, 6 -> 30...etc.). Over the years, Lily has been secretly saving money. In the years 
// that she receives money, Lily's brother takes 1.00 lv from it. Lily sold the toys she received over the years 
// for P lv each and added the amount to the money she saved. With the money, she wanted to buy a washing machine for X lv. 
// Write a program that calculates how much money she has saved and whether she has enough to buy a washing machine.
// Solution:
public class Problem067 {
    public static void main(String[] args) {        
        try(Scanner input = new Scanner(System.in)) {
            int lilyAge = input.nextInt();
            double washingMachinePrice = input.nextDouble();
            int toyPrice = input.nextInt();
            double moneySaved = 0;
            for (int i = 1; i <= lilyAge; i++) {
                if (i % 2 == 0) {
                    moneySaved += ((i / 2) * 10) - 1;
                } else {
                    moneySaved += toyPrice;
                }
            }
            if (moneySaved >= washingMachinePrice) {
                System.out.printf("Yes! %.2f", moneySaved - washingMachinePrice);
            } else {
                System.out.printf("No! %.2f", washingMachinePrice - moneySaved);
            }
        }
    }
}
