package com.exercises;
import java.util.Scanner;
// Description:
// Write a program that calculates whether the budget is sufficient to shoot a film. 
// The film will require a certain number of extras, clothing for each extra, and scenery.
// It is known that:
// • The scenery for the film is worth 10% of the budget.
// • If there are more than 150 extras, there is a discount for clothing worth 10%.
// Input
// 3 lines are read from the console:
// Line 1. Budget for the film - a real number in the interval [1.00 ... 1000000.00]
// Line 2. Number of extras - an integer in the interval [1 ... 500]
// Line 3. Price for clothing for one extra - a real number in the interval [1.00 ... 1000.00]
// Two lines should be printed on the console:
// • If the money for scenery and clothing is more than the budget:
// o "Not enough money!"
// o "Wingard needs {the money not enough for the film} leva more."
// • If the money for the set and costumes is less than or equal to the budget:
// o "Action!"
// o "Wingard starts filming with {the remaining money} leva left."
// The result should be formatted to the second decimal place.
// Solution:
public class Problem029 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Budget for the film: ");
            double budget = input.nextDouble();
            System.out.print("Number of extras: ");
            int extras = input.nextInt();
            System.out.print("Price for clothing for one extra: ");
            double clothing = input.nextDouble();

            double sceneryPrice = budget * 0.1;
            double totalClothingPrice = (double) extras * clothing;
            if (extras > 150) {
                totalClothingPrice *= 0.9;
            }
            double totalPrice = sceneryPrice + totalClothingPrice;
            if (budget >= totalPrice) {
                System.out.printf("Action!\nWingard starts filming with %.2f leva left.", budget - totalPrice);
            } 
            else {
                System.out.printf("Not enough money!\nWingard needs %.2f leva more.", totalPrice - budget);
            }
        }
    }
}
