package com.exercises;
import java.util.Scanner;
// Description:
// Write a program that reads integers in the range from the console until a "stop" command is received. Find the sum of all entered prime numbers and the sum of all entered non-prime numbers. Since by definition in mathematics negative numbers cannot be prime, if a negative number is given as input, the following message "Number is negative." should be output. In this case, the entered number is ignored and is not added to either of the two sums, and the program continues its execution, waiting for the next number to be entered.
// On the output, print the two found sums on two lines in the following format:
// • "Sum of all prime numbers is: {prime numbers sum}"
// • "Sum of all non prime numbers is: {nonprime numbers sum}" odd positions must be equal. If there are no numbers that meet the condition on the console, no result is output.
// Solution:
public class Problem096 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String command = input.next();
            int sumPrime = 0;
            int sumNonPrime = 0;

            while (!command.equals("stop")) {
                int num = Integer.parseInt(command);
                if (num < 0) {
                    System.out.println("Number is negative.");
                    command = input.next();
                    continue;
                }

                if (isPrime(num)) {
                    sumPrime += num;
                } else {
                    sumNonPrime += num;
                }

                command = input.next();
            }

            System.out.printf("Sum of all prime numbers is: %d\n", sumPrime);
            System.out.printf("Sum of all non prime numbers is: %d", sumNonPrime);
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
