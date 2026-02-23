package com.exercises;
import java.util.Scanner;
// Description:
// Write a program that reads a number n entered by the user and prints the numbers 1 to n through 3.
// Solution:
public class Problem056 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            for (int i = 1; i <= n; i+=3) {
                System.out.println(i);
            }
        }
    }
}
