package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Write a program that reads n integers and prints the largest and smallest numbers among the input.
// Solution:
public class Problem061 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int inputsNum = input.nextInt();
            int minNum = 1000000;
            int maxNum = -1000000;
            for (int i = 0; i < inputsNum; i++) {
                int num = input.nextInt();
                if (num <= minNum) {
                    minNum = num;
                }  
                if (num >= maxNum) {
                    maxNum = num;
                }
            }
            System.out.printf("Max number: %d\nMin number: %d", maxNum, minNum);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}