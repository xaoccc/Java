package com.exercises;
import java.util.Scanner;
// Description:
// Write a program that reads from the console two six-digit integers in the range from 100000 to 300000. The first number entered will always be less than the second. On the console, print on 1 line, separated by a space, all the numbers that are between the two numbers read from the console and meet the following condition:
// • the sum of the digits in even and odd positions must be equal. If there are no numbers that meet the condition on the console, no result is output.
// Solution:
public class Problem095 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n1 = input.nextInt();
            int n2 = input.nextInt();

            for (int j = n1; j <= n2; j++) {
                int sum1 = 0;
                int sum2 = 0;
                for (int i = 0; i < 6; i++) {
                    int num = j / (int) Math.pow(10, i);                   

                    num %= 10; 
                    if (i % 2 == 0) {
                        sum1 += num;
                    } else {
                        sum2 += num;
                    }
                }

                if (sum1 == sum2) {
                    System.out.printf("%d ", j);                    
                }
            }
        }
    }
}
