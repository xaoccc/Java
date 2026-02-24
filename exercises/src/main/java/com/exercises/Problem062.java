package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Write a program that reads 2 * n integers entered by the user and checks whether the sum of the first n numbers (left sum) 
// is equal to the sum of the second n numbers (right sum). If equal, print " Yes, sum = " + the sum; otherwise, print " No, 
// diff = " + the difference. The difference is calculated as a positive number (in absolute value).
// Solution:
public class Problem062 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int inputNums = input.nextInt();
            int leftSum = 0;
            int rightSum = 0;
            for (int i = 0; i < inputNums; i++) {
                leftSum += input.nextInt();
            }
            for (int j = 0; j < inputNums; j++) {
                rightSum += input.nextInt();
            }
            if (leftSum == rightSum) {
                System.out.printf("Yes, sum = %d", leftSum);
            } else {
                int diff = leftSum - rightSum;
                System.out.printf("No, diff = %d", (diff > 0) ? diff : -diff);
            }            
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
