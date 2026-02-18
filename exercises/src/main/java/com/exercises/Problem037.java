package com.exercises;
import java.util.Scanner;
// Description:
// Write a console program that calculates the product prices.
// Solution:
public class Problem037 {
    @SuppressWarnings("ConvertToStringSwitch")
    public static void main(String[] args) {
        double[] PRICES_SOFIA = {0.5, 0.8, 1.2, 1.45, 1.6};
        double[] PRICES_PLODIV = {0.4, 0.7, 1.15, 1.3, 1.5};
        double[] PRICES_VARNA = {0.45, 0.7, 1.1, 1.35, 1.55};

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Product: ");
            String product = input.next();
            System.out.print("City: ");
            String city = input.next();
            System.out.print("Quantity: ");           
            double quantity = input.nextDouble();
            if (city.equals("Sofia")) {
                switch (product) {
                    case "coffee" :
                        System.out.println(PRICES_SOFIA[0] * quantity);
                        break;
                    case "water" :
                        System.out.println(PRICES_SOFIA[1] * quantity);
                        break;
                    case "beer" :
                        System.out.println(PRICES_SOFIA[2] * quantity);
                        break;
                    case "sweets" :
                        System.out.println(PRICES_SOFIA[3] * quantity);
                        break;
                    case "peanuts" :
                        System.out.println(PRICES_SOFIA[4] * quantity);
                        break;
                    default:
                        throw new AssertionError();
                }
            }
            else if (city.equals("Plovdiv")) {
                switch (product) {
                    case "coffee" :
                        System.out.println(PRICES_PLODIV[0] * quantity);
                        break;
                    case "water" :
                        System.out.println(PRICES_PLODIV[1] * quantity);
                        break;
                    case "beer" :
                        System.out.println(PRICES_PLODIV[2] * quantity);
                        break;
                    case "sweets" :
                        System.out.println(PRICES_PLODIV[3] * quantity);
                        break;
                    case "peanuts" :
                        System.out.println(PRICES_PLODIV[4] * quantity);
                        break;
                    default:
                        throw new AssertionError();
                }
            }
            else if (city.equals("Varna")) {
                switch (product) {
                    case "coffee" :
                        System.out.println(PRICES_VARNA[0] * quantity);
                        break;
                    case "water" :
                        System.out.println(PRICES_VARNA[1] * quantity);
                        break;
                    case "beer" :
                        System.out.println(PRICES_VARNA[2] * quantity);
                        break;
                    case "sweets" :
                        System.out.println(PRICES_VARNA[3] * quantity);
                        break;
                    case "peanuts" :
                        System.out.println(PRICES_VARNA[4] * quantity);
                        break;
                    default:
                        throw new AssertionError();
                }
            }
            else {
                System.out.println("Invalid input!");
            }
        }
    }
}
