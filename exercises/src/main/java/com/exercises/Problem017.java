package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// For his birthday, Lyubomir received an aquarium in the shape of a parallelepiped. 
// Initially, we read its dimensions from the console in separate lines – length, width and height in centimeters. 
// We need to calculate how many liters of water the aquarium will collect, if we know that a certain percentage 
// of its capacity is occupied by sand, plants, a heater and a pump.
// One liter of water is equal to one cubic decimeter / 1l = 1 dm3 /.
// Write a program that calculates the liters of water needed to fill the aquarium.
// 4 lines are read from the console:
// 1. Length in cm – integer in the interval [10 … 500]
// 2. Width in cm – integer in the interval [10 … 300]
// 3. Height in cm – integer in the interval [10 … 200]
// 4. Percentage – real number in the interval [0.000 … 100.000]
// Solution
public class Problem017 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Length in cm: ");
            int length = input.nextInt();
            System.out.print("Width in cm: ");
            int width = input.nextInt();
            System.out.print("Height in cm: ");
            int height = input.nextInt();
            System.out.print("Percentage: ");
            double percentage = input.nextDouble();

            if (!isValid(length, 501) || !isValid(width, 301) || !isValid(height, 201) || percentage < 0 || percentage > 100) {
                System.out.println("Invalid value!");
                return;
            }
            System.out.println(length * width * height * 0.001 * (1 - percentage/100));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }

    private static boolean isValid(int value, int limit) {
        return value > 9 && value < limit;
    }
}
