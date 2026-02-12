package com.exercises;
// Description:
// Three athletes finish in a race in a certain number of seconds (between 1 and 50). 
// Write a program that reads the athletes' times in seconds entered by the user and 
// calculates their total time in the format "minutes:seconds".
// Solution:
import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem025 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int timeFirst = input.nextInt();
            int timeSecond = input.nextInt();
            int timeThird = input.nextInt();
            if (!isValid(timeFirst) || !isValid(timeSecond) || !isValid(timeThird)) {
                System.out.println("Invalid value!");
                return;
            }
            int totalTime = timeFirst + timeSecond + timeThird;
            if (totalTime % 60 > 9) {
                System.out.printf("%d:%d", totalTime / 60, totalTime % 60);
            } 
            else {
                System.out.printf("%d:0%d", totalTime / 60, totalTime % 60);
            }           
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
    private static boolean isValid(int value) {
        return value > -1 && value < 60;
    }

}
