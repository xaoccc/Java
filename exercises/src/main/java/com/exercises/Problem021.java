package com.exercises;
import java.util.Scanner;
// Description:
// Write a program which checks if a password is correct.
// Solution:
public class Problem021 {
    public static void main(String[] args) {
        String PASSWORD = "s3cr3t!P@ssw0rd";
        try (Scanner input = new Scanner(System.in)) {
            String pwd = input.next();
            if (PASSWORD.equals(pwd)) {
                System.out.println("Welcome");
                return;
            }
            System.out.println("Wrong password!");
        } 
    }
}