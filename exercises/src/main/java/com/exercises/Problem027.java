package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Write a program that reads the hour and minutes of a 24-hour day entered by the user and calculates what time it will be in 15 minutes.
// Print the result in the format hours:minutes. Hours are always between 0 and 23, and minutes are always between 0 and 59. 
// Hours are written with one or two digits. Minutes are always written with two digits, with a leading zero when necessary.
// Solution:
public class Problem027 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Hours: ");
            int hour = input.nextInt();
            System.out.print("Minutes: ");
            int minutes = input.nextInt();
            if (minutes > 44) {
                if (hour == 23) {
                    System.out.printf("0:%02d", minutes + 15 - 60);
                }
                else {
                    System.out.printf("%d:%02d", hour + 1, minutes + 15 - 60);
                }                
            }
            else {
                System.out.printf("%d:%d", hour, minutes + 15);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
