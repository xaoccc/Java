package com.exercises;
import java.util.Scanner;
// Description:
// Print numbers from n to 1.
// Solution:
public class Problem055 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            for (int i = n; i > 0; i--) {
                System.out.println(i);
            }
        }
    }
}
