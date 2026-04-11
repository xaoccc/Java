package com.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem104 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String[] words = input.nextLine().split(" ");
            for (String word : words) {
                if (word.length() % 2 == 0) {
                    System.out.println(word);
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
