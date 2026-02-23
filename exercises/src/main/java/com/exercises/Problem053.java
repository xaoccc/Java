package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Atanas needs to book a hotel and calculate how much his stay will cost. 
// The following types of rooms are available, with the following prices for stays:
//  "room for one person" – 18.00 lv per night
//  "apartment" – 25.00 lv per night
//  "president apartment" – 35.00 lv per night
// According to the number of days he will stay at the hotel (example: 11 days = 10 nights) and the type of room he will choose, he can use different discounts.
// After the stay, Atanas's assessment of the hotel's services can be positive or negative. 
// If his assessment is positive, Atanas adds 25% of the discount to the price with the discount already deducted. 
// If his assessment is negative, he deducts 10% from the price.
// Solution:
public class Problem053 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            int days = input.nextInt();
            input.nextLine(); 
            String type = input.nextLine();
            String rating = input.nextLine();
            if (days < 1) {
                System.out.println("Invalid days input! Days must be a positive integer!");
                return;
            }
            double total = (days - 1) * 18;

            switch (type) {
                case "apartment":
                    total = (days - 1) * 25;
                    if (days < 10) {
                        total *= 0.7;
                    } else if (days < 16) {
                        total *= 0.65;
                    } else {
                        total *= 0.5;
                    }
                    break;
                case "president apartment":
                    total = (days - 1) * 35;
                    if (days < 10) {
                        total *= 0.9;
                    } else if (days < 16) {
                        total *= 0.85;
                    } else {
                        total *= 0.8;
                    }
                default:
                    break;
            }

            switch (rating) {
                case "positive":
                    total *= 1.25;                    
                    break;
                case "negative":
                    total *= 0.9;                    
                    break;
                default:
                    System.out.println(rating);
                    throw new AssertionError();
            }
            System.out.printf("%.2f", total);
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
