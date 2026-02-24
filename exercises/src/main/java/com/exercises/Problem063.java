package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Write a program that reads n integers entered by the user and checks whether the sum of the numbers in even positions is equal 
// to the sum of the numbers in odd positions.
// • If the sums are equal, print two lines: "Yes" and on a new line "Sum = " + the sum;
// • If the sums are not equal, print two lines: "No" and on a new line "Diff = " + the difference.
// The difference is calculated by absolute value.
// Solution:
public class Problem063 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int inputNums = input.nextInt();
            int oddSum = 0;
            int evenSum = 0;
            for (int i = 0; i < inputNums; i++) {
                if (i % 2 == 0) {
                    evenSum += input.nextInt();
                } else oddSum += input.nextInt();                
            }
            if (oddSum == evenSum) {
                System.out.printf("Yes\nSum = %d", oddSum);
            } else {
                int diff = oddSum - evenSum;
                System.out.printf("No\nDiff = %d", (diff > 0) ? diff : -diff);
            }            
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
