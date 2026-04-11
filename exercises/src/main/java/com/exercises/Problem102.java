package com.exercises;
import java.util.ArrayList;
import java.util.Scanner;
// You will be given two sequences of strings, separated by ", ". Print a new list containing only the strings from the first input line, which are substrings of any string in the second input line.
public class Problem102 {
    public static void main(String[] args) {
        System.out.println("Enter a string sequence (strings divided by ' ,': ");
        try(Scanner input = new Scanner(System.in)) {
            String[] arrOne = input.nextLine().trim().split(", ");
            System.out.println("Enter another string sequence (strings divided by ' ,': ");
            String[] arrTwo = input.nextLine().trim().split(", ");
            ArrayList<String> result = new ArrayList<>();

            for (String stringOne : arrOne) {
                for (String stringTwo : arrTwo) {
                    if (stringTwo.contains(stringOne) && !result.contains(stringOne)) {
                        result.add(stringOne);
                    }
                }
            }
            System.out.println(result.toString());
        }
    }

}
