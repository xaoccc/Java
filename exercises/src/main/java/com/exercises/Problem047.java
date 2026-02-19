package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Marin and Nelly are buying a house not far from Sofia. Nelly loves flowers so much that she convinces you to write 
// a program that will calculate how much it will cost them to plant a certain number of flowers and whether the available 
// budget will be enough. Different flowers have different prices.
// The following discounts exist:
// • If Nelly buys more than 80 Roses - 10% discount from the final price
// • If Nelly buys more than 90 Dahlias - 15% discount from the final price
// • If Nelly buys more than 80 Tulips - 15% discount from the final price
// • If Nelly buys less than 120 Daffodils - the price increases by 15%
// • If Nelly buys less than 80 Gladiolus - the price increases by 20%
// 3 lines are read from the console:
// • Type of flowers - text with options - "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
// • Number of flowers - integer in the interval [10…1000]
// • Budget - integer in the interval [50…2500]
// To be printed on the console in one line:
// • If their budget is sufficient - "Hey, you have a great garden with {number of flowers} {type of flowers} and {the remaining amount} leva left."
// • If their budget is NOT enough - "Not enough money, you need {the necessary amount} leva more."
// The amount should be formatted to the second decimal place.
// Solution:
public class Problem047 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            String flower = input.next();
            int num = input.nextInt();
            int budget = input.nextInt();
            double total = 0;

            switch (flower) {
                case "Roses":
                    total = num * 5.0;
                    if (num > 80) {
                        total *= 0.9;
                    }
                    break;
                case "Dahlias":
                    total = num * 3.8;
                    if (num > 90) {
                        total *= 0.85;
                    }
                    break;
                case "Tulips":
                    total = num * 2.8;
                    if (num > 80) {
                        total *= 0.85;
                    }
                    break;
                case "Narcissus":
                    total = num * 3.0;
                    if (num < 120) {
                        total *= 1.15;
                    }
                    break;
                case "Gladiolus":
                    total = num * 2.5;
                    if (num < 80) {
                        total *= 1.2;
                    }
                    break;
                default:
                    throw new AssertionError();
            }

            if (total <= budget) {
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", num, flower, (double) budget - total);
            } else {
                System.out.printf("Not enough money, you need %.2f leva more.", (double) total - budget);
            }

        } catch(InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}

