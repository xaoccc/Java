package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// A hotel offers 2 types of rooms: studio and apartment. Write a program that calculates the price for the entire stay for a studio and 
// an apartment. The prices depend on the month of stay:
// May and October June and September July and August
// Studio – 50 BGN/night Studio – 75.20 BGN/night Studio – 76 BGN/night
// Apartment – ​​65 BGN/night Apartment – ​​68.70 BGN/night Apartment – ​​77 BGN/night
// The following discounts are also offered:
// • For a studio, for more than 7 nights in May and October: 5% discount.
// • For a studio, for more than 14 nights in May and October: 30% discount.
// • For a studio, for more than 14 nights in June and September: 20% discount.
// • For an apartment, for more than 14 nights, regardless of the month: 10% discount.
// Solution:
public class Problem051 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            String month = input.next();
            int nights = input.nextInt();
            double priceStudio = 50;
            double priceApartment = 65;

            switch (month) {
                case "May":
                case "October":
                    if (nights > 14) {
                        priceStudio *= 0.7;
                    } else if (nights > 7) {
                        priceStudio *= 0.95;
                    }                    
                    break;
                case "June":
                case "September":
                    priceStudio = 75.2;
                    priceApartment = 68.7;
                    if (nights > 14) {
                        priceStudio *= 0.8;
                    }                   
                    break;
                case "July":
                case "August":
                    priceStudio = 76;
                    priceApartment = 77;                 
                    break;
                default:
                    break;
            }
            if (nights > 14) {
                priceApartment *= 0.9;
            }
            System.out.printf("Apartment: %.2f lv.\n", priceApartment * nights);
            System.out.printf("Studio: %.2f lv.", priceStudio * nights);
            
        } catch(InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
