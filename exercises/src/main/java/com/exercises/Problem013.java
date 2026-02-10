package com.exercises;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Annie needs to buy a certain number of packets of chemicals, packets of markers, and a whiteboard cleaner. 
// She is a regular customer of a bookstore, so there is a discount for her, which is a certain percentage of the total amount. 
// Write a program that calculates how much money Annie will need to collect to pay the bill, considering the following price list:
// • Packet of chemicals - 5.80 lv.
// • Packet of markers - 7.20 lv.
// • Cleaner - 1.20 lv. (per liter)
// 4 numbers are read from the console:
// · Number of packets of chemicals - integer in the interval [0...100]
// · Number of packets of markers - integer in the interval [0...100]
// · Liters of whiteboard cleaner - integer in the interval [0...50]
// · Percentage discount - integer in the interval [0...100]
// Solution:
public class Problem013 {
    public static void main(String[] args) {
        double CHEMICALS_PACKET_PRICE = 5.8;
        double MARKERS_PACKET_PRICE = 7.2;
        double CLEANER_LITRE_PRICE = 1.2;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Number of packets of chemicals: ");
            int chemicals = input.nextInt();

            System.out.print("Number of packets of markers: ");
            int markers = input.nextInt();

            System.out.print("Liters of whiteboard cleaner: ");
            int cleaners = input.nextInt();

            System.out.print("Percentage discount: ");
            int discount = input.nextInt();
            DecimalFormat df = new DecimalFormat();

            if (!isOutOfRange(chemicals, 100) || !isOutOfRange(markers, 100) || !isOutOfRange(discount, 100)) {
                System.out.printf("Value must be between 1 and %d", 100);
                return;
            }
            if (!isOutOfRange(cleaners, 50)) {
                System.out.printf("Value of cleaners must be between 1 and %d", 50);
                return;
            }

            double totalPrice = (CHEMICALS_PACKET_PRICE * chemicals) + (MARKERS_PACKET_PRICE * markers) + (CLEANER_LITRE_PRICE * cleaners) ;
            double totalDiscount = totalPrice * discount / 100.0;
            System.out.printf(df.format(totalPrice - totalDiscount));
        } catch(InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
        private static boolean isOutOfRange(int value, int limit) {
            return value > 0 && value < limit;
    }
}
