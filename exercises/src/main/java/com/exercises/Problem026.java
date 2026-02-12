package com.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Given an integer – the starting number of points. Bonus points are added to it according to the rules described below. Write a program that calculates the bonus points that the number receives and the total number of points (number + bonus).
// • If the number is up to and including 100, the bonus points are 5.
// • If the number is greater than 100, the bonus points are 20% of the number.
// • If the number is greater than 1000, the bonus points are 10% of the number.
// • Additional bonus points (added separately from the previous ones):
// o For an even number -> + 1 point.
// o For a number ending in 5 -> + 2 points.
// Solution:

public class Problem026 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();
            double bonus = 0.0;
            boolean isEven = num % 2 == 0;
            boolean endsInFive = num % 5 == 0 && num % 2 != 0;
            if (num < 101) {
                bonus += 5;
            } 
            else if (num < 1001) {
                bonus = num * 0.2;
            } 
            else if (num > 1000) {
                bonus = num * 0.1;
            } 
            else {
                System.out.println("Invalid value!");
                return;
            }

            if (endsInFive) {
                bonus += 2;
            } 
            else if (isEven) {
                bonus += 1;
            }
            System.out.println(bonus);
            System.out.println((double) num + bonus);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
