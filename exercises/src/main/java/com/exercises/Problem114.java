package com.exercises;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
// Using a dictionary comprehension, write a program that receives country names on the first line, separated by comma and space ", ", and 
// their corresponding capital cities on the second line (again separated by comma and space ", "). Print each country with their capital 
// on a separate line in the following format: "{country} -> {capital}".

public class Problem114 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String[] countries = input.nextLine().split(", ");
            String[] capitals = input.nextLine().split(", ");
            HashMap<String, String> data = new HashMap<>();
            if (countries.length == capitals.length) {
                for (int i = 0; i < countries.length; i++) {
                    data.put(countries[i], capitals[i]);
                }
                for (Map.Entry<String, String> entry : data.entrySet()) {
                    System.out.println(entry.getKey() + " -> " + entry.getValue());
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
