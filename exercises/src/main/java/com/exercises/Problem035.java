package com.exercises;
import java.util.Scanner;
// Description:
// Write a program that prints the class of the animal according to its name entered by the user.
// Solution:
public class Problem035 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            String animal = input.nextLine();
            switch (animal) {
                case "dog":
                    System.out.println("mammal");
                    break;
                case "snake":
                case "crocodile":
                case "tortoise":
                    System.out.println("reptile");
                    break;
                default:
                    System.out.println("unknown");
                    break;
            }
        }
    }
}
