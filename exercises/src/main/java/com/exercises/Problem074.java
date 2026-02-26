package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Write a program that read a number, then reads numbers until their sum becomes equal or greater than the first number. 
// Finally print the sum of these numbers.
// Solution:
public class Problem074 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();
            int sum = 0;
            while (sum < num) {
                sum += input.nextInt();
            }
            System.out.println(sum);
        } catch(InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
