package com.exercises;
import java.util.Scanner;
// Description:
// Write a program that reads an integer entered by the user and checks whether it is less than 100, between 100 and 200, or greater than 200. If the number is:
// • less than 100 print: "Less than 100"
// • between 100 and 200 print: "Between 100 and 200"
// • greater than 200 print: "Greater than 200"
// Solution:
public class Problem022 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();
            if (num < 100) {
                System.out.println("Less than 100");
            } 
            else if(num < 201) {
                System.out.println("Between 100 and 200");
            } 
            else
            System.out.println("Greater than 200");
        }
    }
}
