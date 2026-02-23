package com.exercises;
import java.util.Scanner;
// Description:
// Write a program that prints every character of an input on a next line.
// Solution:
public class Problem058 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String text = input.nextLine().strip();
            for (int i = 0; i < text.length(); i++) {
                System.out.println(text.charAt(i));
            }
        }
    }
}
