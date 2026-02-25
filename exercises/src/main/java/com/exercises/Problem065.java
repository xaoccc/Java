package com.exercises;
import java.util.Scanner;
// Description:
// Write a program that reads n integers entered by the user and checks whether there is a number among them that is equal to the sum of all the others.
// • If there is such an element, print "Yes" and on a new line "Sum = " + its value
// • If there is no such element, print "No" and on a new line "Diff = " + the difference between the largest element and the sum of the others (in absolute value)
// Solution:
public class Problem065 {
    public static void main(String[] args) {
        int num;
        int maxNum = -1000000;
        int sum = 0;
        try(Scanner input = new Scanner(System.in)) {
            int inputs = input.nextInt();
            for (int i = 0; i < inputs; i++) {
                num = input.nextInt();
                if (num > maxNum) {
                    maxNum = num;
                }
                sum += num;
            }
            if ((double) sum / 2 == (double) maxNum) {
                System.out.printf("Yes\nSum = %d", maxNum);
            } else {
                int diff = sum - (2 * maxNum);
                System.out.printf("No\nDiff = %d", diff > 0 ? diff : -diff);
            }
        }
    }
}
