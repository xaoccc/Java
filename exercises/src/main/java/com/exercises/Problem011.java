package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Write a program that calculates the amount you will receive at the end of the deposit period at a certain interest rate. Use the following formula:
// amount = deposited amount + deposit term * ((deposited amount * annual interest rate ) / 12)
// 3 lines are read from the console:
// 1. Deposited amount – real number in the interval [100.00 … 10000.00]
// 2. Deposit term (in months) – integer in the interval [1…12]
// 3. Annual interest rate – real number in the interval [0.00 …100.00]
// Solution:
public class Problem011 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Deposit amount: ");
            double depositAmount = input.nextDouble();
            if (depositAmount < 100 || depositAmount > 10000) {
                System.out.println("Invalid value. Deposited amount must be a real number in the interval 100.00 - 10000.00.");
                return;
            }
            System.out.print("Deposit term: ");
            byte depositTerm = input.nextByte();
            if (depositTerm < 1 || depositTerm > 12) {
                System.out.println("Invalid value. Deposited term must be an integer in the interval 1 - 12.");
                return;
            }
            System.out.print("Annual interest rate: ");
            double interestRate = input.nextDouble() / 100;
            if (interestRate < 0 || interestRate > 100) {
                System.out.println("Invalid Value. Annual interest rate must be a real number in the interval 0.00 - 100.00.");
                return;
            }
            System.out.printf("Total amount: %.2f", depositAmount + (depositTerm * (depositAmount * interestRate) / 12));

        } catch(InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
