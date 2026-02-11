package com.exercises;
import java.util.Scanner;
// Description:
// Write a console program that reads a rating (integer) entered by the user and prints "Excellent!" if the rating is 5 or higher.
// Solution:
public class Problem018 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int grade = Integer.parseInt(input.next());
            if (grade >= 5) {
                System.out.println("Excellent!");
            }
        }
    }
}
