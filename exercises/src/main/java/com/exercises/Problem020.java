package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Write a program which checks if a number is even or odd.
// Solution:
public class Problem020 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();
            if (num % 2 == 0) {
                System.out.println("even");
                return;
            }
            System.out.println("odd");
        } catch(InputMismatchException e){
            System.out.println("Invalid input!");
        }
    }
}