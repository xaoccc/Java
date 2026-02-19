package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Summer is a very changeable time and Victor needs your help. 
// Write a program that, based on the time of day and the degrees, recommends what clothes to Victor to wear. 
// Your friend has different plans for each stage of the day, which also require a different appearance, you can see them in the table.
// Exactly two lines are read from the console:
// • Degrees - an integer in the interval [10…42]
// • Text, time of day - with options - "Morning", "Afternoon", "Evening"
// Solution:
public class Problem046 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            int degrees = input.nextInt();
            String dayTime = input.next();
            String outfit = "Shirt";
            String shoes = "Moccasins";
            if (degrees < 10) {
                System.out.println("Wrong value. Degrees must be at least 10.");
                return;
            }
            switch (dayTime) {
                case "Morning":
                    if (degrees <= 18) {
                        outfit = "Sweatshirt";
                        shoes = "Sneakers";
                    } else if (degrees >=25) {
                        outfit = "T-Shirt";
                        shoes = "Sandals";
                    }
                    break;
                case "Afternoon":
                    if (degrees > 18 && degrees <=24) {
                        outfit = "T-Shirt";
                        shoes = "Sandals";
                    } else if (degrees >= 25) {
                        outfit = "Swim Suit";
                        shoes = "Barefoot";
                    }
                    break;
                default:
                    break;
            }
            System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);

        } catch(InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}

