package com.exercises;
import java.util.Scanner;
// Description:
// Write a program that reads a number n entered by the user and prints the even powers of 2.
// Solution:
public class Problem057 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            for (int i = 0; i <= n; i+=2) {
                System.out.println((int) Math.pow(2, i));
            }
        }
    }
}
