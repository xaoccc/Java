package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// In a movie theater, the chairs are arranged in a rectangular shape in r rows and c columns. 
// There are three types of screenings with tickets at different prices:
// • Premiere – premiere screening, priced at 12.00 leva.
// • Normal – standard screening, priced at 7.50 leva.
// • Discount – screening for children, schoolchildren and university students at a reduced price of 5.00 leva.
// Write a program that reads the screening type (string), number of rows and number of columns in the hall (integers), 
// entered by the user, and calculates the total ticket revenue for a full hall. The result should be printed with 2 decimal places.
// Solution:
public class Problem045 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            String type = input.next();
            int rows = input.nextInt();
            int columns = input.nextInt();

            switch (type) {
                case "Premiere":
                    System.out.printf("%.2f", rows * columns * 12.00);
                    break;
                case "Normal":
                    System.out.printf("%.2f", rows * columns * 7.50);
                    break;
                case "Discount":
                    System.out.printf("%.2f leva", rows * columns * 5.00);                    
                    break;
                default:
                    throw new AssertionError();
            }

        } catch(InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}