package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Write a program that checks whether the number entered by the user is in the interval [-100, 100] and 
// is different from 0 and outputs "Yes" if it meets the conditions, or "No" if it is outside them.
// Solution:
public class Problem038 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();
            if (num > -101 && num < 101 && num != 0) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        } catch(InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
