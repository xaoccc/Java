package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Write a program that, until the command "Stop" is received, reads integers entered by the user and finds the largest among them. 
// One number is entered per line.
// Solution:
public class Problem077 {
    public static void main(String[] args) {
        int maxNum = Integer.MIN_VALUE;
        try (Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();            
            while (true) {
                if (num > maxNum) {
                    maxNum = num;
                }
                num = input.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println(maxNum);
        }
    }
}
