package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// The user types the amount of cat and dog food he needs. Calulate the total amount for cat and dog food.
// Solution:
public class Problem008 {
    public static void main(String[] args) {
        double DOG_FOOD_PRICE = 2.5;
        int CAT_FOOD_PRICE = 4;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Dog food quantity: ");
            double dogFoodQty = input.nextDouble();
            System.out.print("Cat food amount: ");
            double catFoodQty = input.nextDouble();
            if (catFoodQty < 0 || dogFoodQty < 0) {
                System.out.println("Food quantity cannot be a negaite number");
                return;
            }
            double totatFoodAmount = dogFoodQty * DOG_FOOD_PRICE + catFoodQty * CAT_FOOD_PRICE;
            System.out.printf("Total food amount: %.2feuro", totatFoodAmount);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
