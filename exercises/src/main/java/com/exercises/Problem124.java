package com.exercises;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
// Write a program that receives a list of characters separated by ", ". 
// It should create a dictionary with each character as a key and its ASCII value as a value. 

public class Problem124 {
    public static void main(String[] args) {        
        try (Scanner input = new Scanner(System.in)) {
            String[] letters = input.nextLine().split(", ");
            HashMap<String, Integer> charCodes = new HashMap<>();
            for (String letter : letters) {
                charCodes.put(letter, (int) letter.charAt(0));
            }
            System.out.println(charCodes);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
