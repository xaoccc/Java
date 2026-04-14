package com.exercises;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
// Write a program that prints all elements from a given sequence of words that occur an odd number of times (case-insensitive) in it.

// Words are given on a single line, space-separated.
// Print the result elements in lowercase, in their order of appearance.

public class Problem125 {
    public static void main(String[] args) {        
        try (Scanner input = new Scanner(System.in)) {
            String[] words = input.nextLine().split(" ");
            HashMap<String, Integer> wordsOccurences = new HashMap<>();
            String result = "";
            for(String word : words) {
                wordsOccurences.put(word.toLowerCase(), wordsOccurences.getOrDefault(word.toLowerCase(), 0) + 1);
            }

            for(Map.Entry<String, Integer> entry : wordsOccurences.entrySet()) {
                if (entry.getValue() % 2 != 0) {
                    result += entry.getKey() + " ";
                }
            }
            System.out.println(result.trim());

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
