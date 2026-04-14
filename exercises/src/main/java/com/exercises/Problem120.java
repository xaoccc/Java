package com.exercises;

import java.util.HashMap;
import java.util.Scanner;
// Your first task at your new job is to create a table of the stock in a bakery, and you really don't want to fail on your first day at work.
// You will receive a single line containing some food (keys) and quantities (values). They will be separated by a single space (the first element is the key, the second – the value, and so on). 
// Create a HashMap with all the keys and values and print it on the console.

public class Problem120 {
    public static void main(String[] args) {
        HashMap<String, Integer> bakery = new HashMap<>();
        try (Scanner input = new Scanner(System.in)) {
            String[] bakeryList= input.nextLine().split(" ");
            for(int i=0; i<bakeryList.length; i+=2) {
                bakery.put(bakeryList[i], Integer.valueOf(bakeryList[i + 1]));
            }
            System.out.println(bakery);
        }
    }
}
