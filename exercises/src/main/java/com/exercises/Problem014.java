package com.exercises;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
// Rumen wants to repaint the living room and has hired craftsmen for this purpose. 
// Write a program that calculates the costs of the repair, given the following prices:
// · Protective nylon - 1.50 lv. per sq. meter
// · Paint - 14.50 lv. per liter
// · Paint thinner - 5.00 lv. per liter
// Just in case, to the necessary materials, Rumen wants to add another 10% of the amount of paint and 2 sq. m. of nylon, of course, and 0.40 lv. for bags. The amount paid to the craftsmen for 1 hour of work is equal to 30% of the sum of all costs for materials.
// The input is read from the console and contains exactly 4 lines:
// 1. Required amount of nylon (in sq.m.) - integer in the interval [1... 100]
// 2. Required amount of paint (in liters) - integer in the interval [1…100]
// 3. Amount of thinner (in liters) - integer in the interval [1…30]
// 4. The hours in which the craftsmen will complete the work - integer in the interval [1…9]
// Solution:
public class Problem014 {
    public static void main(String[] args) {
        double NYLON_PRICE = 1.5;
        double PAINT_PRICE = 14.5;
        double PAINT_THINNER_PRICE = 5.0;
        double ADDITIONAL_PAINT = 1.10;
        int ADDITIONAL_NYLON = 2;
        double BAGS_PRICE = 0.4;
        double WORK_PRICE_COEFFICIENT = 0.3;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Required amount of nylon (sq.m.): ");
            int nylon = input.nextInt();

            System.out.print("Required amount of paint (liters): ");
            int paint = input.nextInt();

            System.out.print("Amount of thinner (liters) ");
            int thinner = input.nextInt();

            System.out.print("Number of hours in which the craftsmen will complete the work: ");
            int hours = input.nextInt();
            DecimalFormat df = new DecimalFormat();

            if (!isValid(nylon, 100) || !isValid(thinner, 30) || !isValid(paint, 100) || !isValid(hours, 9)) {
                System.out.println("Invalid value!");
                return;
            }
            double totalNylonPrice = NYLON_PRICE * (nylon + ADDITIONAL_NYLON);
            double totalPaintPrice = PAINT_PRICE * paint * ADDITIONAL_PAINT;
            double totalThinnerPrice = PAINT_THINNER_PRICE * thinner;
            double totalMaterialsPrice = totalNylonPrice + totalPaintPrice + totalThinnerPrice + BAGS_PRICE;
            double workerPrice = totalMaterialsPrice * WORK_PRICE_COEFFICIENT * hours;
            System.out.println(df.format(totalMaterialsPrice + workerPrice));
  
        } catch(InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }

    private static boolean isValid(int value, int limit) {
        return value > 0 && value < limit;
    }
}
