package com.exercises;
import java.util.Scanner;
// Description:
// Write a program that checks all possible combinations of a pair of numbers in the interval of two given numbers. The output prints which combination is the one whose sum of the numbers is equal to a given magic number. If there is no combination that meets the condition, a message is printed that it was not found.
// The input is read from the console and consists of three lines:
// • First line – start of the interval – integer in the interval [1...999]
// • Second line – end of the interval – integer in the interval [greater than the first number...1000]
// • Third line – the magic number – integer in the interval [1...10000]
// Solution:
public class Problem091 {
    public static void main(String[] args) {
        int combination = 0;
        try (Scanner input = new Scanner(System.in)) {
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int magicNum = input.nextInt();
            for (int i = num1; i < num2 + 1; i++) {
                for (int j = num1; j < num2 + 1; j++) {
                    combination++;
                    if (i + j == magicNum) {
                        System.out.printf("Combination N:%d (%d + %d = %d)", combination, i, j, magicNum);
                        return;
                    }
                    System.out.printf("%d -- %d\n", i, j);                    
                }
            }
            System.out.printf("%d combinations - neither equals %d", combination, magicNum);

        }
    }
}
