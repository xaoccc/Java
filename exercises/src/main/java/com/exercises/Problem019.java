package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Write a program which compares two integers.
// Solution:
public class Problem019 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            if (num1 > num2) {
                System.out.println(num1);
                return;
            }
            System.out.println(num2);
        } catch(InputMismatchException e){
            System.out.println("Invalid input!");
        }
    }
}
