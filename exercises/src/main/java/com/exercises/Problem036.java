package com.exercises;
import java.util.Scanner;
// Description:
// Write a console program that reads the age (decimal number) and gender ("m" or "f") entered by the user 
// and prints one of the following titles:
// • "Mr." - male (gender "m") 16 years or older
// • "Master" - male (gender "m") under 16 years old
// • "Ms." - female (gender "f") 16 years or older
// • "Miss" - female (gender "f") under 16 years old
// Solution:
public class Problem036 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Age: ");
            double age = input.nextDouble();
            System.out.print("Gender: ");
            String gender = input.next();

            if (age < 16) {
                if (gender.equals("f")) {
                    System.out.println("Miss");
                }
                else if (gender.equals("m")) {
                    System.out.println("Master");
                }
            }
            else if (age >= 16) {
                if (gender.equals("f")) {
                    System.out.println("Ms.");
                }
                else if (gender.equals("m")) {
                    System.out.println("Mr.");
                }
            }

        }
    }
}
