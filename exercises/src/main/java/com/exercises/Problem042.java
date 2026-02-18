package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// A given number is valid if it is in the range [100…200] or is 0. 
// Write a program that reads an integer entered by the user and prints "invalid" if the entered number is not valid.
// Solution:
public class Problem042 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();
            if (num >= 100 && num <= 200 || num == 0) {
                return;
            }
            System.out.println("invalid");
            
        } catch(InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
