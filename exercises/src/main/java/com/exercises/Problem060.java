package com.exercises;
import java.util.Scanner;
// Description:
// Write a program that reads n integers entered by the user and sums them.
// • The first line of input contains the number of numbers n.
// • The next n lines contain one integer each.
// The program should read the numbers, sum them, and print their sum.
// Solution:
public class Problem060 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int inputsNum = input.nextInt();
            int sum = 0;
            for (int i = 0; i < inputsNum; i++) {
                int num = input.nextInt();
                sum += num;
            }
            System.out.println(sum);
        }
    }
}
