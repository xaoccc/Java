package com.exercises;
// You are playing a game, and your goal is to win a legendary item - any legendary item will be good enough. However, it's a tedious process, and it requires quite a bit of farming. The possible items are:

// "Shadowmourne" - requires 250 Shards
// "Valanyr" - requires 250 Fragments
// "Dragonwrath" - requires 250 Motes
// "Shards", "Fragments", and "Motes" are the key materials (case-insensitive), and everything else is junk.
// You will be given lines of input in the format:
// "{quantity1} {material1} {quantity2} {material2} … {quantityN} {materialN}"
// Keep track of the key materials - the first one that reaches 250, wins the race. At that point, you have to print that the corresponding legendary item is obtained.
// In the end, print the remaining shards, fragments, motes in the format:
// "shards: {number_of_shards}
// fragments: {number_of_fragments}
// motes: {number_of_motes}"
// Finally, print the collected junk items in the order of appearance.
// Input
// Each line comes in the following format: "{quantity1} {material1} {quantity2} {material2} … {quantityN} {materialN}"
// Output
// On the first line, print the obtained item in the format: "{Legendary item} obtained!"
// On the next three lines, print the remaining key materials
// On the several final lines, print the junk items
// All materials should be printed in the format: "{material}: {quantity}"
// The output should be lowercase, except for the first letter of the legendary

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Problem116 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String[] material = input.nextLine().toLowerCase().split(" ");
            HashMap<String, Integer> materials = new HashMap<>();
            Map<String, String> ITEMS = Map.of("shards", "Shadowmourne", "fragments", "Valanyr", "motes", "Dragonwrath");
            while (true) { 
                materials.put(material[1], materials.getOrDefault(materials.get(material[1]), 0) + Integer.valueOf(material[0]));
                if (ITEMS.containsKey(material[1]) && materials.get(material[1]) >= 250 ) {
                    System.out.printf("%s obtained!\n", ITEMS.get(material[1]));
                    materials.put(material[1], materials.get(material[1]) - 250);
                    break;                    
                }
                material = input.nextLine().toLowerCase().split(" ");
            }

            for(Map.Entry<String, Integer> entry : materials.entrySet()) {
                System.out.printf("%s: %d\n", entry.getKey(), entry.getValue());
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
