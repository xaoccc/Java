package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Write a program that reads a product name entered by the user and checks whether it is a fruit or a vegetable.
// • The fruits "fruit" are banana, apple, kiwi, cherry, lemon and grapes
// • The vegetables "vegetable" are tomato, cucumber, pepper and carrot
// • All others are "unknown"
// Print "fruit", "vegetable" or "unknown" according to the product entered.
// Solution:

public class Problem041 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String productName = input.next();
            if (productName.equals("banana")
                    || productName.equals("apple")
                    || productName.equals("kiwi")
                    || productName.equals("cherry")
                    || productName.equals("lemon")
                    || productName.equals("grapes")) {
                System.out.println("fruit");
            } else if (productName.equals("tomato")
                    || productName.equals("cucumber")
                    || productName.equals("pepper")
                    || productName.equals("carrot")) {
                System.out.println("vegetable");
            } else {
                System.out.println("unknown");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
