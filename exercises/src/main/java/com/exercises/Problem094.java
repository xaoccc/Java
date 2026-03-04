package com.exercises;
import java.util.Scanner;
// Description:
// Print a number pyramid.
// Solution:
public class Problem094 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int current = 1;
            
            for (int row=1; row <= n; row++) {
                for (int col=1; col <= row; col++) {
                    if (current > n) {
                        break;
                    }
                    System.out.printf("%d ", current);
                    current++;
                }
                System.out.println("");
            }
        }

    }
}
