package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Calculate radians to degrees.
// Solution:
public class Problem010 {
    public static void main(String[] args) {
        System.out.print("Radians: ");
        try (Scanner input = new Scanner(System.in)) {
            double radians = input.nextDouble();
            System.out.printf("Degrees: %f", radians * 180 / Math.PI );
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input! The input must be a number!");
        }
    }
}
