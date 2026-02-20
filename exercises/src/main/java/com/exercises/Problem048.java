package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Tony and his friends loved to go fishing, they were so passionate about fishing that they decided to go fishing by boat. 
// The price for renting the boat depends on the season and the number of fishermen.
// The price depends on the season:
// • The price for renting the boat in the spring is 3000 BGN.
// • The price for renting the boat in the summer and autumn is 4200 BGN.
// • The price for renting the boat in the winter is 2600 BGN.
// Depending on its number, the group receives a discount:
// • If the group is up to 6 people inclusive – a 10% discount.
// • If the group is from 7 to 11 people inclusive – a 15% discount.
// • If the group is from 12 and up – a 25% discount.
// The fishermen receive an additional 5% discount if there is an even number, unless it is autumn - then they do not receive an additional discount.
// Write a program that calculates whether the fishermen will collect enough money.
// Solution:

public class Problem048 {
    public static void main(String[] args) {
        int ship_price = 4200;
        double finalPrice;
        try (Scanner input = new Scanner(System.in)) {
            int budget = input.nextInt();
            String season = input.next();
            int groupSize = input.nextInt();
            if (groupSize < 1) {
                System.out.println("Invalid fishermen number. Enter a positive integer.");
                return;
            }
            switch (season) {
                case "Spring":
                    ship_price = 3000;
                    break;
                case "Winter":
                    ship_price = 2600;
                    break;
                default:
                    break;
            }

            if (groupSize < 7) {
                finalPrice = ship_price * 0.9;
            } else if (groupSize < 12) {
                finalPrice = ship_price * 0.85;
            } else {
                finalPrice = ship_price * 0.75;
            }

            if (groupSize % 2 == 0 && !season.equals("Autumn")) {
                finalPrice *= 0.95;
            }
   
            if (finalPrice <= budget) {
                System.out.printf("Yes! You have %.2f leva left.", budget - finalPrice);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", finalPrice - budget);
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
