package com.exercises;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
// Write a program that receives info from the console about people and their phone numbers.
// Each entry should have a name and a number (both strings) separated by a "-". If you receive a name that already exists in the phonebook, update its number.
// After filling the phonebook, you will receive a number – N. Your program should be able to perform a search of contact by name and 
// print its details in the format: "{name} -> {number}". In case the contact isn't found, print: "Contact {name} does not exist."

public class Problem115 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String[] contact = input.nextLine().split("-");
            HashMap<String, String> phonebook = new HashMap<>();
            while (contact.length == 2) {
                phonebook.put(contact[0], contact[1]);
                contact = input.nextLine().split("-");
            }
            
            for (int i=0; i<Integer.parseInt(contact[0]); i++) {
                String searchContact = input.nextLine();
                if (phonebook.containsKey(searchContact)) {
                    System.out.printf("%s -> %s\n", searchContact, phonebook.get(searchContact));
                } else {
                    System.out.printf("Contact %s does not exist.\n", searchContact);
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
