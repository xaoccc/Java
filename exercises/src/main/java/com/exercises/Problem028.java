package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Petya has a toy store. She receives a large order that she must fulfill. With the money she will earn, she wants to go on a trip.
// Toy prices:
// • Puzzle - 2.60 lv.
// • Talking doll - 3 lv.
// • Teddy bear - 4.10 lv.
// • Minion - 8.20 lv.
// • Truck - 2 lv.
// If the ordered toys are 50 or more, the store gives a discount of 25% of the total price. 
// Petya must give 10% of the money she earns for the rent of the store. 
// Calculate whether the money will be enough for her to go on a trip.
// 6 lines are read from the console:
// 1. Price of the excursion - real number in the interval [1.00 … 10000.00]
// 2. Number of puzzles - integer in the interval [0 … 1000]
// 3. Number of talking dolls - integer in the interval [0 … 1000]
// 4. Number of teddy bears - integer in the interval [0 … 1000]
// 5. Number of minions - integer in the interval [0 … 1000]
// 6. Number of trucks - integer in the interval [0 … 1000]
// Output
// The following is printed on the console:
// • If there is enough money, it prints:
// o "Yes! {remaining money} lv left."
// • If there is NOT enough money, it prints:
// o "Not enough money! {not enough money} lv needed."
// The result must be formatted to the second decimal place.
// Solution:
public class Problem028 {
    public static void main(String[] args) {
        double PUZZLE_PRIZE = 2.6;
        double DOLL_PRICE = 3.0;
        double BEAR_PRICE = 4.1;
        double MINION_PRICE = 8.2;
        double TRUCK_PRICE = 2.0;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Price of the excursion: ");
            double excursionPrice = input.nextDouble();
            System.out.print("Number of puzzles: ");
            int puzzles = input.nextInt();
            System.out.print("Number of talking dolls: ");
            int dolls = input.nextInt();
            System.out.print("Number of teddy bears: ");
            int bears = input.nextInt();
            System.out.print("Number of minions: ");
            int minions = input.nextInt();
            System.out.print("Number of trucks: ");
            int trucks = input.nextInt();
            int toysNum = puzzles + dolls + bears + minions + trucks;

            double total = (PUZZLE_PRIZE * puzzles) + (DOLL_PRICE * dolls) + (BEAR_PRICE * bears) + (MINION_PRICE * minions) + (TRUCK_PRICE * trucks);
            if (toysNum >= 50) {
                total *= 0.75;
            }
            total *= 0.9;
            if (excursionPrice <= total) {
                System.out.printf("Yes! %.2f lv left.", total - excursionPrice);
            } else {
                System.out.printf("Not enough money! %.2f lv needed.", excursionPrice - total);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
