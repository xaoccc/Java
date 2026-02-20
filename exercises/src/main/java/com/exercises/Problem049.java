package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Strangely enough, most people plan their vacations early. A young programmer has a certain budget and free time in a given season. 
// Write a program that takes the budget and season as input, and outputs where the programmer will vacation and how much he will spend.
// The budget determines the destination, and the season determines how much of the budget he will spend. If it is summer, 
// he will vacation at a campsite, and in winter at a hotel. If he is in Europe, regardless of the season, he will vacation at a hotel. 
// Each campsite or hotel, depending on the destination, has its own price that corresponds to a certain percentage of the budget:
// • At 100lv. or less – somewhere in Bulgaria
// o Summer – 30% of the budget
// o Winter – 70% of the budget
// • At 1000lv. or less – somewhere in the Balkans
// o Summer – 40% of the budget
// o Winter – 80% of the budget
// • At more than 1000lv. – somewhere in Europe
// o When traveling in Europe, regardless of the season, you will spend 90% of your budget.
// // Solution:
public class Problem049 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            double budget = input.nextDouble();
            String season = input.next();
            String destination = "Balkans";
            String accomodation = "Hotel";
            double finalPrice = 0.0;
            if (budget <= 100) {
                destination = "Bulgaria";
            } else if (budget > 1000) {
                destination = "Europe";
            }

            switch (destination) {
                case "Bulgaria":
                    switch (season) {
                        case "summer":
                            finalPrice = budget * 0.3;
                            accomodation = "Camp";
                            break;
                        case "winter":
                            finalPrice = budget * 0.7;
                            break;
                        default:
                            break;
                    }
                    break;
                case "Balkans":
                    switch (season) {
                        case "summer":
                            finalPrice = budget * 0.4;
                            accomodation = "Camp";
                            break;
                        case "winter":
                            finalPrice = budget * 0.8;
                            break;
                        default:
                            break;
                    }
                    break;
                case "Europe":
                    finalPrice = budget * 0.9;
                    break;
                default:
                    break;
            }
            System.out.printf("Somewhere in %s\n%s - %.2f", destination, accomodation, finalPrice);

        } catch(InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}

