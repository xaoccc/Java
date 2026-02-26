package com.exercises;
import java.util.Scanner;
// Description:
// Write a program that calculates how much money is in the account after you make a certain number of payments. 
// On each line you will receive the amount that you need to deposit into the account, until you receive the command "NoMoreMoney". 
// For each amount received, the console should display "Increase: " + the amount and add it to the account. 
// If you get a number less than 0, the console should display "Invalid operation!" and the program should end. 
// When the program ends, it should print "Total: " + the total amount in the account formatted to the second decimal place.
// Solution:
public class Problem076 {

    public static void main(String[] args) {
        double total = 0.0;
        try (Scanner scanner = new Scanner(System.in)) {            
            while (true) {
                String input = scanner.nextLine();

                if (input.equals("NoMoreMoney")) {
                    break;
                }
                double amount = Double.parseDouble(input);

                if (amount < 0) {
                    System.out.println("Invalid operation!");
                    break;
                }
                System.out.printf("Increase: %.2f%n", amount);
                total += amount;
            }
            System.out.printf("Total: %.2f%n", total);
        } catch (NumberFormatException e) {
            System.out.printf("Invalid operation!\nTotal: %.2f%n", total);
        }
    }
}
