package com.exercises;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
// You will be given a sequence of strings, each on a new line until you receive the "stop" command. Every odd line on the console represents a resource (e.g., Gold, Silver, Copper, and so on) and every even - quantity. Your task is to collect the resources and print them each on a new line.
// Print the resources and their quantities in the following format:
// "{resource} -> {quantity}"
// The quantities will be in the range [1 … 2 000 000 000].

public class Problem113 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            String material = input.nextLine();
            HashMap<String, Integer> materials = new HashMap<>();
            while (!material.equals("stop")) {
                int quantity = Integer.parseInt(input.nextLine());
                materials.put(material, materials.getOrDefault(material, 0) + quantity);
                material = input.nextLine();
            }

            for (Map.Entry<String, Integer> entry : materials.entrySet()) {
                System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
