package com.exercises;
import java.util.Scanner;
// Description:
// Write a program that reads the day of the week (text), in English - entered by the user. 
// If the day is a working day, print on the console - "Working day", if it is a holiday - "Weekend". 
// If text other than a day of the week is entered, print - "Error".
// Solution:
public class Problem034 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            String day = input.nextLine();
            switch (day) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    System.out.println("Working day");
                    break;
                case "Saturday":
                case "Sunday":
                    System.out.println("Weekend");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }       
    }
}
