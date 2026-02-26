package com.exercises;
import java.util.Scanner;
// Description:
// Write a program that reads text from the console (a string) and prints it until it receives the "Stop" command.
// Solution:
public class Problem073 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            String username = input.nextLine();
            String password = input.nextLine();
            String command = input.nextLine();
            while (!command.equals(password)) {                
                command = input.nextLine();
            }
            System.out.printf("Welcome %s!", username);
        } 
    }
}
