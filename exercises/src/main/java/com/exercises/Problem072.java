package com.exercises;
import java.util.Scanner;
// Description:
// Write a program that reads text from the console (a string) and prints it until it receives the "Stop" command.
// Solution:
public class Problem072 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            String command = input.nextLine();
            while (!command.equals("Stop")) {
                System.out.println(command);
                command = input.nextLine();
            }
        } 
    }
}
