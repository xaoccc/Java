package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Concatenate data.
// Solution:
public class Problem006 {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your first name: ");
            String firstName = input.nextLine().trim();

            System.out.print("Enter your last name: ");
            String lastName = input.nextLine().trim();

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(input.nextLine());

            System.out.print("Enter your town: ");
            String town = input.nextLine().trim();


            if (age < 0) {
                System.out.println("Invalid age value!");
                return;
            }

            System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, town);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }      

    }
}
