package com.exercises;
import java.util.Scanner;
// Description:
// Peter wants to buy N video cards, M processors and P RAM. 
// If the number of video cards is greater than the number of processors, he receives a 15% discount on the final bill. 
// The following prices apply:
// • Video card – 250 BGN/pc.
// • Processor – 35% of the price of the purchased video cards/pc.
// • RAM – 10% of the price of the purchased video cards/pc.
// Calculate the amount needed to purchase the materials and calculate whether the budget will be enough.
// Input
// The input consists of four lines:
// 1. Peter's budget - a real number in the interval [0.0…100000.0]
// 2. The number of video cards - an integer in the interval [0…100]
// 3. The number of processors - an integer in the interval [0…100]
// 4. The number of RAM - an integer in the interval [0…100]
// Output
// 1 line is printed to the console, which should look like this:
// • If the budget is sufficient:
// "You have {remaining budget} leva left!"
// • If the amount exceeds the budget:
// "Not enough money! You need {necessary amount} leva more!"
// The result should be formatted to the second decimal place.
// Solution:
public class Problem031 {
    public static void main(String[] args) {
        int VIDEO_CARD_PRICE = 250;
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Peter's budget: ");
            double budget = input.nextDouble();
            System.out.print("The number of video cards: ");
            int videoCardsNum = input.nextInt();
            System.out.print("The number of processors: ");
            int processorsNum = input.nextInt();
            System.out.print("The number of RAM: ");           
            int ramNum = input.nextInt();
            double videoCardsTotal = VIDEO_CARD_PRICE * videoCardsNum;
            double total = videoCardsTotal + (videoCardsTotal * 0.35 * processorsNum) + (videoCardsTotal * 0.1 * ramNum);
            if (videoCardsNum > processorsNum) {
                total *= 0.85;
            }
            if (total <= budget) {
                System.out.printf("You have %.2f leva left!", budget - total);
            }
            else {
                System.out.printf("Not enough money! You need %.2f leva more!", total - budget);
            }
        }
    }
}
