package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Calculate the price needed to green a yard. The price is 7.61 euro per square meter. The client has always a 18% discount.
// Solution:
public class Problem009 {
    public static void main(String[] args) {
        double PRICE_SQ_METER = 7.61;
        double DISCOUNT = 0.18;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Yard area: ");
            double yardArea = input.nextDouble();
            if (yardArea < 0) {
                System.out.println("The area cannot be a negative number!");
                return;
            }
            double totalPrice = yardArea * PRICE_SQ_METER;
            System.out.printf("The final price is: %.2f euro.\n", totalPrice * (1 - DISCOUNT));
            System.out.printf("The discount is %.2f euro.", totalPrice * DISCOUNT);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input! The input must be a number!");
        }
    }
}
