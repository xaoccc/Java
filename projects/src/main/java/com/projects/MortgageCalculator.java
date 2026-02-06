package com.projects;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            byte PERCENT = 100;
            byte MONTHS = 12;
            System.out.print("Principal: $");
            int principal = input.nextInt();
            if (principal < 0) {
                System.out.println("Principal cannot be a negative number!");
                return;
            }
            System.out.print("Annual Interest Rate: ");
            double interestRate = input.nextDouble() / PERCENT / MONTHS;
            if (interestRate < 0) {
                System.out.println("Interest rate cannot be a negative number!");
                return;
            }
            System.out.print("Years: ");
            byte years = input.nextByte();
            if (years < 0) {
                System.out.println("Years cannot be a negative number!");
                return;
            }
            int n = years * MONTHS;
            
            System.out.printf("Mortgage: $%.2f", (principal * (interestRate * calculate(interestRate, n)) / 
            (calculate(interestRate, n) - 1)));

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }

    public static double calculate(double r, int n) {
        return Math.pow((1 + r), n);
    }
}
