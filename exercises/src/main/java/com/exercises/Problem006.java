package com.exercises;
// Description:
// Concatenate data.
// Solution:
import java.util.InputMismatchException;
import java.util.Scanner;
public class Problem006 {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your first name: ");
            String name = input.nextLine();

            System.out.print("Enter your last name: ");
            String lastName = input.nextLine();

            System.out.print("Enter your age: ");
            byte age = input.nextByte();

            if (age < 0) {
                System.out.println("Invalid age value!");
                return;
            }

            System.out.printf("You are %s %s. You are %d years old.", name, lastName, age);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }      

    }
}
